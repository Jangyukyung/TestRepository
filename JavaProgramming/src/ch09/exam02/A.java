package ch09.exam02;

public class A {
	//Field

	//Constructor
	A(){
		final int localVariable=2;
		//����Ŭ����
		class D{
			//Field
			//Constructor
			//Method
			void dMethod(){
				int result=localVariable+8;
				//localVariable=10;//final�� ���������� ���� �Ұ�
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
			
			}
		}
	}
}
