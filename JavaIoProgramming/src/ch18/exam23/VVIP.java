/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam23;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.in;

/**
 *
 * @author Administrator
 */
public class VVIP extends Person implements Serializable{
    private int memberShipNo;
    private String grade;
    
    public VVIP(){
        
    }
    
    public VVIP(int memberShipNo, String grade, String name,int age) {
        super(name,age);
        this.memberShipNo = memberShipNo;
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getMemberShipNo() {
        return memberShipNo;
    }

    public void setMemberShipNo(int memberShipNo) {
        this.memberShipNo = memberShipNo;
    }

    private void writeObject(ObjectOutputStream out)throws IOException{  //wrteObject실행되면 
        out.writeUTF(getName());  //부모이름을 저장하고 
        out.writeInt(getAge());
        
        out.defaultWriteObject();  //자기객체 필드를 직렬화시킴  
    }
    private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
        setName(in.readUTF()); //문자열을읽고 부모의 Name에 셋 
        setAge(in.readInt());
        
        in.defaultReadObject(); //자기객체 필드를 역직렬화
    }
}
