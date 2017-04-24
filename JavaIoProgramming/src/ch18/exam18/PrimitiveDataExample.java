/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Administrator
 */
public class PrimitiveDataExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int value=10;
        double value2=2.5;
        boolean value3=false;
        String value4="자바";
        
        OutputStream os=new FileOutputStream("src/ch18/exam18/test.dat"); //int는 문자가 아니고 바이트단위로 저장하니까 test.dat
        DataOutputStream dos=new DataOutputStream(os);
        dos.write(value);
        dos.writeDouble(value2);
        dos.writeBoolean(value3);
        dos.writeUTF(value4);
        
        dos.flush();
        os.flush();
        dos.close();
        os.close();
        
        InputStream is=new FileInputStream("src/ch18/exam18/test.dat");
        DataInputStream dis=new DataInputStream(is);
        int readValue=dis.readInt();
        double readDouble=dis.readDouble();
        Boolean readBoolean=dis.readBoolean();
        String readString=dis.readUTF();
        
        System.out.println(readValue);
        System.out.println(readDouble);
        System.out.println(readBoolean);
        System.out.println(readString);
        dis.close();
        is.close();
 
        
    }
    
}
