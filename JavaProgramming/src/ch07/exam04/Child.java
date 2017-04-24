package ch07.exam04;

public class Child extends Parent{
	//Field
	String firstName;
	//Constructor
	Child(String lastName,String firstName){
		super(lastName);
		this.firstName=firstName;
	}
	//Method
	void play(){
		System.out.println("놀자");
	}
	
	@Override //어노테이션
	void sound(){
		System.out.println("낄낄");
	}
	
	void parentSound(){
		super.sound(); //parent의 sound메소드 호출
	}
}
