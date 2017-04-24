/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam20;

import ch18.exam21.Member;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Administrator
 */
public class ObjectOutputExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos= new FileOutputStream("src/ch18/exam20/object.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Member member=new Member("감자바",30);
        oos.writeObject(member);
        
        oos.flush();
        fos.flush();
        oos.close();
        fos.close();
        
    }
    
}
