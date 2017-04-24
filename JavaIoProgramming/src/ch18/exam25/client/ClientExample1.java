/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam25.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;



/**
 *
 * @author Administrator
 */
public class ClientExample1 {
    public static void main(String[] args) {
        Socket socket=null;
        try {
            //how1
            //socket=new Socket("192.168.3.29",50001);
            
            //how2
            socket=new Socket();
            socket.connect(new InetSocketAddress("192.168.3.29",50001));
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