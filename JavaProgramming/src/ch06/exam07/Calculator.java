package ch06.exam07;

public class Calculator {
	//Field
	static String model="MI-85";
	static String makeDay="2017-03-29";
	static String info;//MI-84(2017-03-29)
	
	//static block
	static{
		info=model;
		info+="(";
		info+=makeDay;
		info+=")";
		
	}//메소드영역에 코드가 다 올라간뒤 실행된다.
	
	//Method
	
}
