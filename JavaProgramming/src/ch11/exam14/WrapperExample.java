package ch11.exam14;

public class WrapperExample {

	public static void main(String[] args) {
		int v1=10;
		
		Integer v2=10; //v2는 참조변수인데 /10을 가지고있는 Integer객체를 대입한다  //auto boxing
		int v3=v2; //v2가 가지고있는 10을 꺼내어서 대입 //auto unboxing
		
		method1(3); //3을 가지고있는 Integer객체가 자동으로 만들어져서 그 객체의 번지가 대입된다. //auto boxing
		int v4=method2(); //Integer가 자동으로 내부의 int값을 빼낸다. -언박싱 //auto unboxing
	}
	
	public static void method1(Integer obj){
	}
	
	public static Integer method2(){
		return 1;
	}
	

}
