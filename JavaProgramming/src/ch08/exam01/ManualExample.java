package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {
		Manual manual=new Bike();  //Manual�̶�� �������̽��� Bike�� ����ϰڴ�. Bkie�ʿ��� �����
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
