/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException{
//        InputStream is=System.in;
//        InputStreamReader isr=new InputStreamReader(is);
//        
//        int data=isr.read();
//        System.out.println((char)data);

          InputStream is =new FileInputStream("src/ch18/exam13/test2.txt");
          InputStreamReader isr=new InputStreamReader(is,"EUC-KR");
          int data=isr.read();
          System.out.println((char)data);
    }
}
