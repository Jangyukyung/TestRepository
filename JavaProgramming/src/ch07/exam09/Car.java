package ch07.exam09;

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
		if(tire instanceof SnowTire){ //�ڽ����� �˻�
			SnowTire snowTire=(SnowTire)tire;
			//SnowTire.notSlide();
		}
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
