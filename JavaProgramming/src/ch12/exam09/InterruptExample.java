package ch12.exam09;

public class InterruptExample {

	public static void main(String[] args) {
		//how2
		PrintThread2 thread2=new PrintThread2();
		thread2.start();
		try{Thread.sleep(2000);}catch(Exception e){}
		thread2.interrupt(); //실행중인 상태는 의미없고, 일시정지 상태일때 예외발생
		
	}
}
