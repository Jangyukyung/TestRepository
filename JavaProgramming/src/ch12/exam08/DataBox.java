package ch12.exam08;

public class DataBox {
	//Field
	private String data;
	//Constructor

	//Method
	public synchronized String getData() {
		if(data==null){  //���� �� ������ wait
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue= data;  //������ null�� �ٲ��ֱ� ���ؼ� 
		System.out.println("���� ������: " + returnValue);
		data=null;
		notify(); //�������, data�� �� ä�� 
		return data;
	}

	public synchronized void setData(String data) {
		if(this.data!=null){  //���� �� ������ wait
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("���� ������: " + this.data);
		notify();
	}
	
}
