package ch09.exam03;

public class A {
	//Field
	int aField;
	//Constructor
	A(){
		//����Ŭ����
		class D{
			//Field
			//Constructor
			//Method
			void dMethod(){
				aField=10;
			}
		}
	}
	//Method
	void amethod(){
		//����Ŭ����
		class E{
			//Field
			//Constructor
			//Method
			void eMethod(){
				aField=10;
			}
		}
	}
	//Nested Class
	class B{
		//Field
		//Constructor
		//Method
		void bMethod(){
			aField=10;
		}
	}
	static class C{ //A�� ��� ��밡��
		//Field
		//Constructor
		//Method
		void cMethod(){
			//aField=10; //A�� �־�� ��밡��
		}
	}
	
}
