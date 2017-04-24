package ch12.exam06;

public class ThreadA extends Thread{
	//Field
	private boolean stop=false; //스레드를 종료하기 위한 목적
	private boolean work=true; //스레드 작업을 양보할 목적 
	//Constructor
	
	//Method
	@Override
	public void run() {
		while(!stop){
			if(work){
			System.out.println("Thread A 작업중!");
			}else{
				yield();
			}
		}
		System.out.println("Thread A 작업종료!");
	}

	public void setStop(boolean stop) { //private이기 떄문에 외부에서 바꿀수 없어서 
		this.stop = stop;
	}

	public void setWork(boolean work) {
		this.work = work;
	}
}
