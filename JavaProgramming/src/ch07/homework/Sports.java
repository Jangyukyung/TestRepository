package ch07.homework;

public class Sports extends Car{
	@Override 
	public void speedUp(){
		speed +=10;
	}
	@Override
	public void stop(){
		System.out.println("������ī�� ����");
		speed=0;
	}
}