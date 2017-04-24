package ch06.homework;

public class Head {
	//Field
	String direction;
	//Constructor
	
	//Method
	void headUp(){
		System.out.println("얼굴 위로 움직임");
		direction="headup";
	}
	void headDown(){
		System.out.println("얼굴 아래로 움직임");
		direction="headdown";
	}
	void headLeft(){
		System.out.println("얼굴 왼쪽으로 움직임");
		direction="headleft";
	}
	void headRight(){
		System.out.println("얼굴 오른쪽으로 움직임");
		direction="headright";
	}
}
