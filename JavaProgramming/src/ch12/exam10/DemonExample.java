package ch12.exam10;

public class DemonExample {

	public static void main(String[] args) {
		System.out.println("워드프로세스를 시작함");
		AutoSaveThread thread=new AutoSaveThread();
		thread.setDaemon(true);  //보조스레드
		thread.start();
		
		
		
		try{Thread.sleep(5000);}catch(Exception e){}
		System.out.println("워드프로세스를 종료함");
	}
}
