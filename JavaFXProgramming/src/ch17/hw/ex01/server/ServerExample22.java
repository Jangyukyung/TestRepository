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
public class ServerExample22 {
    public static void main(String[] args) {
         ServerSocket serverSocket=null;
        try {
            //서버소켓 생성
            serverSocket=new ServerSocket();
           //현재 사용할 수없는 어댑터이면 문제발생이 가능하다.
           //포토와 바인딩 하기 //서버와 포트를 연결하는 것을 용어로 바인딩 한다고 한다.
           serverSocket.bind(new InetSocketAddress(50001));//특정한 ip 로만 들어오는거를 수락하겠다 싶을 때는 앞에 붙여주고 그게 아닐겨우는 그냥해준다.
           //연결 기다리기 
           Socket socket=serverSocket.accept();//클라이언트 연결이 들어오기 전까지는 계속해서 대기상태가 된다.
           //클라이언트의 정보 얻기
           InetSocketAddress isa=(InetSocketAddress)socket.getRemoteSocketAddress();//서버 입장에서 원격은 클라이언트 어드레스????실질적으로 리턴하는 값은 
           //inetSocket address 이다.
            System.out.println(isa.toString());//클라이언트 포트 번호는 중요하지 않다. 클라이언트가 어떤ip 를 가지고 있나 중요하다.
            System.out.println(isa.getHostName());//외부에서 접근하면 ip 주소가 나온다.
           //통신하기
           
           //연결끊기
           socket.close();
        } catch (IOException ex) {
             try {
                 //서버 소켓 닫기
                 serverSocket.close();
             } catch (IOException ex1) {
                
             }
        }
        
      
    }
}
