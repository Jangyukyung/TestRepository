package ch11.exam15;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//how 1
		int maxNum=6;
		double random=Math.random();
		int num1=(int)(Math.random()*6)+1;
		
		System.out.println(num1);
		
		//how2
		Random obj=new Random();
		int num2=obj.nextInt(maxNum)+1;
		System.out.println(num2);
	}

}
