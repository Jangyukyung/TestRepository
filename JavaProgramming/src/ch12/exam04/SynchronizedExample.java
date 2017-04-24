package ch12.exam04;

public class SynchronizedExample {

	public static void main(String[] args) {
		Calculator calc=new Calculator(); //user1,user2에 사용됨 
		
		User1 user1=new User1(); //스레드객체생성
		user1.setCalculator(calc);
		user1.start();
		
		
		
		User2 user2=new User2();
		user2.setCalculator(calc);
		user2.start();
	}

}
