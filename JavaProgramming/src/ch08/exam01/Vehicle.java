package ch08.exam01;

public class Vehicle {
	//Field
	private Manual manual;//manual�λ�밡���Ѱ�ü�� �� ���� 
	
	//Constructor
	Vehicle(Manual manual){
		this.manual=manual;
	} //�������̽����� ���� 
	
	//Method
	public void move(){
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff(); 
	} //� ��ü�� ����Ǵ°��� ���� move�ٸ��� �����. -������
}
