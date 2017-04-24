package ch14.exam01;
import java.awt.Toolkit;
public class BeepExample {
	public static void main(String[] args) {
		
		Thread thread =new Thread(()->{ //Runnable이 익명객체
			
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++){
					toolkit.beep();
					try{
						Thread.sleep(500);
					}catch(InterruptedException e){
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
