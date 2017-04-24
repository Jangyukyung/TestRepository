/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam22;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Member implements Serializable{
    //Field
    private static final long serialVersionUID=1;
    private String name;
    private int age;
    private String job;
    
    //Constructor
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //Method
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
