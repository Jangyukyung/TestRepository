package ch07.exam08;

public class Car {
	//Field
	private Tire tire; 
	//Constructor
	public Car(Tire tire){ //3가지 
		this.tire=tire;
		
	}
	//Method
	public void run(){
		tire.roll(); //어떤객체가 대입되었는지에 따라 다르게 실행됨
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
