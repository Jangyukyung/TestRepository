package ch11.exam03;

import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member m1= new Member("blue");
		
		System.out.println(m1.toString());//Member�� toString���������.Object�� toString!!
		System.out.println(m1);//toString�ڵ����� ȣ��
		
		String result=m1+" good@!!";
		System.out.println(result);
	}
}
