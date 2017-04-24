/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Administrator
 */
public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path=ReadExample.class.getResource("test.txt").getPath();
        Reader reader = new FileReader(path);
         
        
        String str="";
        int data=-1;
        while(true){
            data=reader.read();
            if(data==-1) break;
            str+=(char)data;
        }
        
        System.out.println(str);
    }
    
   
}
