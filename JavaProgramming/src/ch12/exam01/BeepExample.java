package ch12.exam01;
import java.awt.Toolkit;
public class BeepExample {
	public static void main(String[] args) {
		/*//소리를 내는 코드 
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++){
			toolkit.beep();
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
			}	
		}*/
	/*	BeepTask beepTask=new BeepTask();
		Thread thread= new Thread(beepTask);
		thread.start();*/
		Thread thread =new Thread(new Runnable(){ //Runnable이 익명객체
			@Override
			public void run() {
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++){
					toolkit.beep();
					try{
						Thread.sleep(500);
					}catch(InterruptedException e){
					}
			}
		}
		});
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
