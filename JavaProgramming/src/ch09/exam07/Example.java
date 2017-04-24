package ch09.exam07;

public class Example{
	public static void main(String[] args){
		//로컬클래스를 정의하고 객체 생성
		
		/*class B2 extends A.B{
			@Override
			void bMethod() { 
				System.out.println("B2-bMethod()");
			}
		}
		//B2 b2=new B2();
		//b2.bMethod();
		
		A.B b=new B2();
		b.bMethod(); //b.Method로 접근 
		*/
		
		A.B b=new A.B(){  //
			@Override
			void bMethod() {
				System.out.println("B2-bMethod()");
			}
		}; //생성자호출하면 중괄호
		b.bMethod();
	}
	
	
}
