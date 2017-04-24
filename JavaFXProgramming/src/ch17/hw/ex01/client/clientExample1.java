/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.hw.ex01.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class clientExample1 {

    public static void main(String[] args) {
        Socket socket = null;
        
        try{
        socket=new Socket();
        
        socket.connect(new InetSocketAddress("192.168.3.28", 50001));
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
