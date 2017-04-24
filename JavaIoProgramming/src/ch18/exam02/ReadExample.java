/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path=ReadExample.class.getResource("test.txt").getPath();
        InputStream is=new FileInputStream(path);
       
       byte[] data=new byte[3];
       int readBytes=-1;
       String strData="";
       
       while(true){
        readBytes=is.read(data);  //데이터를 바이트배열에 저장하고 읽은 수를 리턴
        if(readBytes==-1)break;
        System.out.println("읽은 바이트 수 " +readBytes);
        System.out.println("읽은 바이트 값 "+Arrays.toString(data));
        strData+=new String(data,0,readBytes);  //바이트배열을 문자열로
        
       }
        System.out.println("------------------------");
        System.out.println(strData);
       
//        readBytes=is.read(data);
//        System.out.println("읽은 바이트 수 " +readBytes);
//        System.out.println("읽은 바이트 값 "+Arrays.toString(data));
//        strData=new String(data,0,readBytes);  //바이트배열을 문자열로
//        System.out.println("읽은 문자열: "+strData);
//        
        
    
    }
}
