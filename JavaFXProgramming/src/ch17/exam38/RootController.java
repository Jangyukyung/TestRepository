/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam38;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label label;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private Task <Integer> task;
	@FXML
	private Label lblResult;
	
	
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
	}	

	private void handleBtnStart(ActionEvent e) {
		task=new Task<Integer>(){
			@Override
			protected Integer call() throws Exception {
				int result=0;
				for(int i=0;i<=100;i++){
					result+=i;
					//how1
					//updateProgress(i,100);
					//updateMessage(String.valueOf(i));
					
					
					//how2
					double value=i;   //i는 final 속성을 가지기 때문에 
					Platform.runLater(()->{
						progressBar.setProgress(value/100);
						lblWorkDone.setText(String.valueOf(value));
					});
					
					
					if(isCancelled()) {break;}  //cancel() 호출되었나 체크
					try{Thread.sleep(100);					
					}catch(Exception e){
						break;
					}
				}				
				return result;
			}

			@Override
			protected void succeeded() {   //UI 변경할수 있다 
				int result=getValue();
				lblResult.setText(String.valueOf(result));
			}

			@Override
			protected void cancelled() {
				lblResult.setText("작업취소");
			}

			@Override
			protected void failed() {
				
			}
			
		    
			
		};
		//how1
	//	progressBar.progressProperty().bind(task.progressProperty());
	//	lblWorkDone.textProperty().bind(task.messageProperty());  //task의 message속성을 수정하겠다 
		
		Thread thread =new Thread(task);  //JavaFXApplication Thread
		thread.setDaemon(true);
		thread.start();
	}

	private void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
	
}
