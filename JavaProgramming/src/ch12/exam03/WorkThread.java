package ch12.exam03;

public class WorkThread extends Thread{
	//Field
	
	//Constructor
	WorkThread(String threadName){
		//super(threadName); //부모스레드생성자통해서
		setName(threadName);
	}
	//Method
	@Override
	public void run() {
		//String threadName=Thread.currentThread().getName();
		String threadName=getName(); //스레드안에서 이렇게 사용해도됨
		for(int i=0;i<2;i++){
			System.out.println(threadName+"가 출력한 내용");
		}
	}
}
