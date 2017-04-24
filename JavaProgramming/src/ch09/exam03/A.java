package ch09.exam03;

public class A {
	//Field
	int aField;
	//Constructor
	A(){
		//로컬클래스
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
		//로컬클래스
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
	static class C{ //A가 없어도 사용가능
		//Field
		//Constructor
		//Method
		void cMethod(){
			//aField=10; //A가 있어야 사용가능
		}
	}
	
}
