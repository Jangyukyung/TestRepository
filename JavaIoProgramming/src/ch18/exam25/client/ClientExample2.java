/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam25.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;



/**
 *
 * @author Administrator
 */
public class ClientExample2 {
    public static void main(String[] args) {
        Socket socket=null;
        try {
            //소켓 생성
            socket=new Socket();
            //연결 요청
            socket.connect(new InetSocketAddress("192.168.3.29",50001));
            
            String str=null;
            str.length();
            //통신 하기 
            /*
            OutputStream os=socket.getOutputStream();
            String strData="유경";
            byte[] data=strData.getBytes("UTF-8");
            os.write(data);
            os.flush();
            
            System.out.println("데이터보내기성공!");
            
            InputStream is=socket.getInputStream();
            data=new byte[100];
            int readBytes=is.read(data);
            strData=new String(data,0,readBytes);
            
            System.out.println("받은데이터 : "+ strData);
            */
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(socket.isClosed()){  //현재소켓 연결되어있는지 먼저 확인하고 
        try {
            socket.close();  //연결끊기
        } catch (IOException ex) {
            
        }
        
    }
}
}