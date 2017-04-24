/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Administrator
 */
public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path=ReadExample.class.getResource("test.txt").getPath();
        InputStream is=new FileInputStream(path);
       
       while(true){
        int v1=is.read();
        if(v1==-1)break; //읽을게 없으면 -1리턴
        System.out.print( (char)v1);
        }
       
       
        
       int v2=-1;
       while((v2=is.read())!=-1){
           System.out.print((char)v2);          
       }
      is.close();  
    }
    
   
}
