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
			field=10;  //����� field
			this.field=10;
			A.this.field=10; //��øŬ�������� �ٱ�Ŭ������ ��ü �����Ҷ�
		}
	}
	
}