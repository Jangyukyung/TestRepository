package ch12.exam03;

public class WorkThread extends Thread{
	//Field
	
	//Constructor
	WorkThread(String threadName){
		//super(threadName); //�θ𽺷�����������ؼ�
		setName(threadName);
	}
	//Method
	@Override
	public void run() {
		//String threadName=Thread.currentThread().getName();
		String threadName=getName(); //������ȿ��� �̷��� ����ص���
		for(int i=0;i<2;i++){
			System.out.println(threadName+"�� ����� ����");
		}
	}
}