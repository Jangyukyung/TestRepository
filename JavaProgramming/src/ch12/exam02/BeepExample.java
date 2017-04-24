package ch12.exam02;
import java.awt.Toolkit;
public class BeepExample {
	public static void main(String[] args) {
		//소리를 내는 코드 
		/*BeepThread beepThread=new BeepThread();
		beepThread.start();*/
		
		Thread thread=new Thread(){  //스레드 생성
			@Override
			public void run() {
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++){
					toolkit.beep();
					System.out.println(Thread.currentThread().getName());
					try{
						Thread.sleep(500);
					}catch(InterruptedException e){
					}
			}
		}
		}; //Thread가 익명객체
		//sSystem.out.println(Thread.currentThread().getName());
		thread.start();
		
		//프린트를 하는 코드
		for(int i=0;i<5;i++){
			System.out.println("띵");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
			}
		}
	}
}
