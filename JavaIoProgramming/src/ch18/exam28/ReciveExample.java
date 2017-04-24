/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam28;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Administrator
 */
public class ReciveExample {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket datagramSocket=new DatagramSocket(50002);
        
        DatagramPacket datagramPacket=new DatagramPacket(
        new byte[100],100);
        
        datagramSocket.receive(datagramPacket);
        
        byte[] data=datagramPacket.getData();
        int readBytes=datagramPacket.getLength();
        String strData=new String(data,0,readBytes);
        System.out.println("받은 데이터: "+strData);
        
        datagramSocket.close();
        
    }
}
