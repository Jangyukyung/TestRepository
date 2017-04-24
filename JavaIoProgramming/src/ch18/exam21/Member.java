/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam21;

import ch18.exam20.*;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Member implements Serializable{
    //Field
    
    private String name;
    private int age;
    public static String nation="한국";
    
    //Constructor
    
    //Method

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String mname) {
        this.name = mname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
