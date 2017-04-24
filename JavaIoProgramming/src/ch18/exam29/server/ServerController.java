/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam29.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ServerController implements Initializable {
	public static ServerController instance;  //자기자신의 인스턴스
	@FXML
	private Button btnStartStop;
	@FXML
	private TextArea txtDisplay;

	private ExecutorService executorService;
	private ServerSocket serverSocket;  //연결수락하는작업
	private List<Client> connections=new Vector<Client>();
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ServerController.instance=this;  //자기자신의 참조를 필드에서 얻음으로...
		btnStartStop.setOnAction(e->handlebtnStartStop(e));
	}	

	private void handlebtnStartStop(ActionEvent e) {
		if(btnStartStop.getText().equals("시작")){
			startServer();
		}else if(btnStartStop.getText().equals("멈춤")){
			stopServer();
		}
	}

	private void startServer() {
		//스레드풀 생성
		executorService=Executors.newFixedThreadPool(100);
		
		//서버소켓 생성
		try {
			serverSocket=new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.3.29",50001));
		} catch (IOException ex) {
			stopServer();
			return; 
		}
		
		//연결 수락 작업 정의
		Runnable acceptTask=() -> { 
			//UI 변경 내용
			Platform.runLater(()->{  //이유?
				btnStartStop.setText("멈춤");
				display("서버 시작");
			});
				
			while(true){
				try {
					//수락코드
					Socket socket=serverSocket.accept();  //연결요청들어오면 socket리턴
					//연결된 클라이언트 정보 얻기
					String clientInfo="[연결 수락 : "+socket.getRemoteSocketAddress()+" ]";
					Platform.runLater(()->display(clientInfo)); //UI 연결코드 
					
					//통신용 Client 객체 생성
					Client client=new Client(socket);
					//Vector에 Client저장
					connections.add(client);
					//총 Client수 출력
					Platform.runLater(()->display("[연결 개수 : "+connections.size()+"]"));
				} catch (IOException ex) {
					stopServer();
					break;
				}
			}
		};
		
		//스레드풀의 작업큐에 작업 넣기
		executorService.submit(acceptTask);
	}

	public void stopServer() {
		try {
			//how1
			for(Client client:connections){
				client.socket.close();  //모든 클라이언트의 소켓 close
			}
			connections.clear();  // 닫고 비우기 
			
			//how2
//			Iterator<Client> iterator=connections.iterator();
//			while(iterator.hasNext()){
//				Client client=iterator.next();
//				client.socket.close();
//				iterator.remove();
//			}
			
			executorService.shutdownNow();
			serverSocket.close();
			

		} catch (IOException ex) {
		}
		Platform.runLater(()->{
			btnStartStop.setText("시작");
			display("서버 멈춤!");
		});
	}
	
	private void display(String text){
		txtDisplay.appendText(text+"\n");  //행을추가해라~~
	}
	
	class Client{
		Socket socket; 
		Client(Socket socket){
			this.socket=socket;
			receive();
		}
		void receive(){
			//받기 작업 정의
			Runnable receiveTask=()->{
				try {
					while(true){
						InputStream inputStream=socket.getInputStream();
						byte[] byteArr=new byte[100];
						int readBytes=inputStream.read(byteArr);//
						if(readBytes==-1) throw new Exception();
						String strData=new String(byteArr,0,readBytes);
						for(Client client:connections){
							client.send(strData);
						}
					}
				} catch (Exception e) {
					try {
						String clientInfo="[연결 끊김 : "+socket.getRemoteSocketAddress()+" ]";
						Platform.runLater(()->display(clientInfo));
						this.socket.close();
						connections.remove(Client.this);  //바깥쪽 객체를 가르킬땐 .this
						Platform.runLater(()->display("[연결 개수 : "+connections.size()+"]"));
					} catch (IOException ex) {	
					}
				}
			};
			
			//스레드풀의 작업큐에 작업넣기
			executorService.submit(receiveTask);
		}
		void send(String message){  
			try{
			//작업스레드가
			OutputStream os=socket.getOutputStream();
			byte[] byteArr=message.getBytes();
			os.write(byteArr);
			os.flush();
			} catch (IOException ex) {
				connections.remove(Client.this);
				try {
					socket.close();
				} catch (IOException ex1) {
					
				}
			}
		}
	}
}
