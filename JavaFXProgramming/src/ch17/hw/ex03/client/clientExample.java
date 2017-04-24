/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.hw.ex03.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;


/**
 *
 * @author Administrator
 */
public class clientExample {

    public static void main(String[] args) {
        Socket socket = null;
        //how1
        //socket = new Socket("192.168.3.28", 50001);//서버의 ip 주소 서버와 클라이언트 동일한 컴퓨터에서 돌리기 때문에
        //위에꺼는 소켓을 만들고서 바로 연결 요청이 된다.
        try{
            //소켓 생성
        socket=new Socket();
        //연결요청
        socket.connect(new InetSocketAddress("192.168.3.28", 50001));
        String str=null;
        str.length();//예외 발생하면 종료된다.
        //통신하기
        OutputStream os=socket.getOutputStream();
        String strData="감자바";//다른걸로 인코딩 할경우 서버에서도 같은 방식으로 인코딩을 해야 된다.
        byte[]data=strData.getBytes("EUC-KR");//기본적으로 UTF-8이다.
        os.write(data);
        os.flush();
            System.out.println("보내기 성공");
        InputStream is=socket.getInputStream();
           data=new byte[100];
           int readBytes=is.read(data);
           strData=new String(data,0,readBytes);
            System.out.println("받은 데이터:"+strData);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        if (socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }
    }
}
