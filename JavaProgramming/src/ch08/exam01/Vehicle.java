package ch08.exam01;

public class Vehicle {
	//Field
	private Manual manual;//manual로사용가능한객체는 다 가능 
	
	//Constructor
	Vehicle(Manual manual){
		this.manual=manual;
	} //인터페이스만을 설계 
	
	//Method
	public void move(){
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff(); 
	} //어떤 객체가 실행되는가에 따라서 move다르게 실행됨. -다형성
}
