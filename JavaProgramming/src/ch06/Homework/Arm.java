package ch06.homework;

public class Arm {
	//Field
	String direction;
	//Constructor
	Arm(String direction){
		this.direction=direction;
	}
	//Method
	void armForward(){
		System.out.print(direction +"ÆÈ ¾ÕÀ¸·Î ");
	}
	void armBackward(){
		System.out.print(direction +"ÆÈ µÚ·Î ");
	}
}
