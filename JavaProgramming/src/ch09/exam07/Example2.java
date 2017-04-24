package ch09.exam07;

public class Example2{
	public static void main(String[] args){
		//로컬클래스를 정의하고 객체 생성
		/*
		class CImpl implements A.C{
			//C라고하는 interface를 구현한 CImpl을 만들겠다.
		@Override
		public void cMethod() {
			System.out.println("CImplt-cMethod()");
			}
		}
		//CImpl cimpl=new CImpl();
		A.C c=new CImpl();
		cimpl.cMethod();
		*/
		A.C c=new A.C(){ //C를 가지고 구현클래스를 만드는데, 괄호안에 내용을 넣고 , 객체를 생성하여 대입
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		};
		c.cMethod();
	}
}
