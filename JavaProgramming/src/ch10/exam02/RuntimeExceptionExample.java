package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		try{
			String str=null;
			System.out.println(str.length());
		} catch(NullPointerException e){
			System.out.println(e.getMessage());//e�󤩴� �޼ҵ尡 ������ �ִ� ������ ���� getMessgae�޼ҵ� ȣ��
		}finally{
			System.out.println("���������� ����ǵ��� ��");
		}
		
		Scanner scanner=new Scanner(System.in);  //import�ʿ�
		while(true){
			System.out.println("�Է�: ");
			String strNum=scanner.nextLine();
			try{
				int num=Integer.parseInt(strNum); //���ڸ� �־��ٸ� NumberFormat���ܹ߻� 
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �Է��ϼ���");//�ٽ� �ݺ� 
			}
			
		}
	
	}

}
