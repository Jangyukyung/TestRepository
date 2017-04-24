/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam25.server;

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
            //ServerSocket 생성
           serverSocket=new ServerSocket(); //현재 네트워크 어댑터가 사용할수 없는 상태라면 오류발생  /네트워크 카드에 문제가 있을 때 
           //포트와 바인딩
           serverSocket.bind(new InetSocketAddress(50001));
           //연결기다리기
           Socket socket=serverSocket.accept(); //클라이언트 연결이 들어올때까지 계속 대기상태
           //클라이언트의 정보얻기
           InetSocketAddress isa=(InetSocketAddress)socket.getRemoteSocketAddress(); //클라이언트 주소 얻음
           System.out.println(isa.toString());
           System.out.println(isa.getHostName());
           //통신하기
           
           
           //연결끊기
           socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //serverSocket이 50001번을 현재 사용하고 있느냐? 
        if(serverSocket!=null && !serverSocket.isClosed()){
            //ServerSokcet 닫기
            try {
                //serverSocket 닫기( 50001번을 해제한다 )
                serverSocket.close();
            } catch (IOException ex1) {
                
            }
            
        }
            
        
    }
}
