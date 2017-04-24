package ch12.exam08;

public class DataBox {
	//Field
	private String data;
	//Constructor

	//Method
	public synchronized String getData() {
		if(data==null){  //읽을 값 없으면 wait
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue= data;  //데이터 null로 바꿔주기 위해서 
		System.out.println("읽은 데이터: " + returnValue);
		data=null;
		notify(); //상대방깨움, data에 값 채움 
		return data;
	}

	public synchronized void setData(String data) {
		if(this.data!=null){  //읽을 값 없으면 wait
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("생성 데이터: " + this.data);
		notify();
	}
	
}
