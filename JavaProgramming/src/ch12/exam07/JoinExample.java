package ch12.exam07;

public class JoinExample {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
		
		try {  //메인스레드가 실행하고 있음 
			thread.join();  //스레드 끝날때 까지 기다리겠다.
		} catch (InterruptedException e) {  
		}   
		
		long result=thread.getSum();
		System.out.println(result);
	}
}
