package ch07.exam08;

public class Car {
	//Field
	private Tire tire; 
	//Constructor
	public Car(Tire tire){ //3���� 
		this.tire=tire;
		
	}
	//Method
	public void run(){
		tire.roll(); //���ü�� ���ԵǾ������� ���� �ٸ��� �����
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
