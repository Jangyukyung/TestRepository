package ch11.exam03;

import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member m1= new Member("blue");
		
		System.out.println(m1.toString());//Member에 toString저장안했음.Object의 toString!!
		System.out.println(m1);//toString자동으로 호출
		
		String result=m1+" good@!!";
		System.out.println(result);
	}
}
