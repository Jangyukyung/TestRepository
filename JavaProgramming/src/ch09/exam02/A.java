package ch09.exam02;

public class A {
	//Field

	//Constructor
	A(){
		final int localVariable=2;
		//로컬클래스
		class D{
			//Field
			//Constructor
			//Method
			void dMethod(){
				int result=localVariable+8;
				//localVariable=10;//final로 선언했으니 변경 불가
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
			
			}
		}
	}
}
