package ch12.exam04;

public class SynchronizedExample {

	public static void main(String[] args) {
		Calculator calc=new Calculator(); //user1,user2�� ���� 
		
		User1 user1=new User1(); //�����尴ü����
		user1.setCalculator(calc);
		user1.start();
		
		
		
		User2 user2=new User2();
		user2.setCalculator(calc);
		user2.start();
	}

}
