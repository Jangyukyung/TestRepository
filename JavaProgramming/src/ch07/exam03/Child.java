package ch07.exam03;

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
		System.out.println("����");
	}
	
	@Override
	void sound() {
		// TODO Auto-generated method stub
		super.sound();
	}
}
