package ch06.exam08;

public class Calculator {
	//Field
	private static Calculator singleton=new Calculator(); //자기자신 타입 필드  //외부에서 접근못하게 private
	
	//Constructor
	private Calculator(){
		
	}

	static Calculator getInstance(){ //이 클래스 밖에서 접근 가능 
		return singleton;
	}
	//Method
	
}
