package ch06.homework;

public class Leg {
	//Field
	String direction;
	//Constructor
	Leg (String direction){
		this.direction=direction;
	}
	//Constructor
		
	//Method
	void legForward(){
		System.out.println(direction +"�ʴٸ� ������ ");
	}
	void legBackward(){
		System.out.println(direction +"�ʴٸ� �ڷ� ");
	}
}
