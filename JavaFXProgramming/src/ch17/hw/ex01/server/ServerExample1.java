/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.hw.ex01.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author Administrator
 */
public class ServerExample1 {
    public static void main(String[] args) {
         ServerSocket serverSocket=null;
        try {
            //서버소켓 생성
            serverSocket=new ServerSocket();
           serverSocket.bind(new InetSocketAddress(50001));
           //연결 기다리기 
           Socket socket=serverSocket.accept();
           //클라이언트의 정보 얻기
           InetSocketAddress isa=(InetSocketAddress)socket.getRemoteSocketAddress();//서버 입장에서 원격은 클라이언트 어드레스????실질적으로 리턴하는 값은 
           
            System.out.println(isa.toString());
            System.out.println(isa.getHostName());
           //통신하기
           //연결끊기
           socket.close();
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        //ServerSocket 이 50001 을 현재 사용하고 있느냐 물어보는 것이다. 사용하고 있으면 더이상 사용하지 말아라 50001번을 사용하고 있으면 close 하고 
            if(serverSocket!=null && !serverSocket.isClosed()){
             try{//서버 소켓 닫기
                 //50001번을 해제한다.
                 serverSocket.close();
                 } catch (IOException ex1) {}
        
            }
      
    }
}
