/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam04;

import ch18.exam03.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Administrator
 */
public class WriteExample {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        //String path=WriteExample.class.getResource("test.txt").getPath();
       //OutputStream os=new FileOutputStream(path);
       
        OutputStream os=new FileOutputStream("src/ch18/exam04/test.txt");
        byte[] data={97,98,99};
        //byte[] data="abc".getBytes();
        
        os.write(data);
        
      
       os.flush();
       os.close();
        //Thread.sleep(10000);
    
    }
}
