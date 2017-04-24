package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {
		Manual manual=new Bike();  //Manual이라는 인터페이스로 Bike를 사용하겠다. Bkie쪽에서 실행됨
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		
		move(new Bike());
		move(new Car());
	}
	
	public static void move(Manual manual){
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
	
	
}
