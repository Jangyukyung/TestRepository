/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Administrator
 */
public class OutputStreamWriterExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os =new FileOutputStream("src/ch18/exam14/test.txt");
        OutputStreamWriter osw=new OutputStreamWriter(os);
        
       // byte[] data="가나".getBytes();
        
       
        osw.write("가나");
        osw.flush();
        osw.close();
        
        
        
    }
}
