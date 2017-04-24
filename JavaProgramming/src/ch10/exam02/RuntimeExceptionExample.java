package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		try{
			String str=null;
			System.out.println(str.length());
		} catch(NullPointerException e){
			System.out.println(e.getMessage());//e라ㄹ는 메소드가 가지고 있는 번지로 가서 getMessgae메소드 호출
		}finally{
			System.out.println("정상적으로 실행되도록 함");
		}
		
		Scanner scanner=new Scanner(System.in);  //import필요
		while(true){
			System.out.println("입력: ");
			String strNum=scanner.nextLine();
			try{
				int num=Integer.parseInt(strNum); //문자를 넣었다면 NumberFormat예외발생 
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력하세용");//다시 반복 
			}
			
		}
	
	}

}
