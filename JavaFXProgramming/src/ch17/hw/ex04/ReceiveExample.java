/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.hw.ex04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Administrator
 */
public class ReceiveExample {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket datagramSocket=new DatagramSocket(50002);//포트 번호로 데이터 들어온다.
        
        DatagramPacket datagramPacket=new DatagramPacket(new byte[100],100);//데이터 공간의 저장 공간을 만들어준다
        datagramSocket.receive(datagramPacket);//리시브로 받는다
        byte[]data=datagramPacket.getData();
        int readByte=datagramPacket.getLength();
        String strData=new String(data,0,readByte);
        System.out.println(strData);
        datagramSocket.close();
    }
}
