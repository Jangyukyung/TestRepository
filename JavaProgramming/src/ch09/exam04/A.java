package ch09.exam04;

public class A {
	//Field
	int field;
	//Constructor

	//Method

	//Nested Class
	class B{
		//Field
		int field;
		//Constructor
		
		//Method
		void method(){
			field=10;  //가까운 field
			this.field=10;
			A.this.field=10; //중첩클래스에서 바깥클래스의 객체 참조할때
		}
	}
	
}
