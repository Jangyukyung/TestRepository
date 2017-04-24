/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam28;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 *
 * @author Administrator
 */
public class SendExample {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket datagramSocket=new DatagramSocket();
        
        String strData="Hello";
        byte[] data=strData.getBytes();
        DatagramPacket datagrampacket=new DatagramPacket(
        data,data.length,new InetSocketAddress("192.168.3.29",50002));
        
        datagramSocket.send(datagrampacket);
        
        datagramSocket.close();
    }
}
