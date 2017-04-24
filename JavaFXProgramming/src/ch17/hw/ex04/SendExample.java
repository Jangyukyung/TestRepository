/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.hw.ex04;

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
   byte[]data=strData.getBytes();//hello 의 바이트얼마만큼인지 알아낸다.
   //추상 메소드가 먼가?
   DatagramPacket datagramPacket=new DatagramPacket(data,data.length,new InetSocketAddress("192.168.3.28",50002));//보낼 데이터
    datagramSocket.send(datagramPacket);//샌드를 통해서 보낸다
    }
}
