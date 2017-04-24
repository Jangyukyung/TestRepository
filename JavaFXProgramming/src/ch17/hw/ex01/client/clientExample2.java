/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.hw.ex01.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class clientExample2 {

    public static void main(String[] args) {
        Socket socket = null;
        try{
            socket=new Socket();
            socket.connect(new InetSocketAddress("192.168.3.28", 50001));
            String str=null;
            str.length();
           
            OutputStream os=socket.getOutputStream();
            String strData="감자바";
            byte[]data=strData.getBytes("EUC-KR");
            os.write(data);
            os.flush();
                System.out.println("보내기 성공");
            InputStream is=socket.getInputStream();
               data=new byte[100];
               int readBytes=is.read(data);
               strData=new String(data,0,readBytes);
                System.out.println("받은 데이터:"+strData);
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
