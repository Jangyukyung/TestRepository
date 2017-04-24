package ch09.exam05;

public class A {
	//Field
	
	//Constructor
	A(){
		//로컬클래스
		class D{}
		D d=new D();
	}
	//Method
	void method(){
		//로컬클래스
		class E{}
		E e=new E();
	}
	//Nested Class
	class B{}
	static class C{}
	
}
