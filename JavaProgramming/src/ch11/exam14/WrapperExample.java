package ch11.exam14;

public class WrapperExample {

	public static void main(String[] args) {
		int v1=10;
		
		Integer v2=10; //v2�� ���������ε� /10�� �������ִ� Integer��ü�� �����Ѵ�  //auto boxing
		int v3=v2; //v2�� �������ִ� 10�� ����� ���� //auto unboxing
		
		method1(3); //3�� �������ִ� Integer��ü�� �ڵ����� ��������� �� ��ü�� ������ ���Եȴ�. //auto boxing
		int v4=method2(); //Integer�� �ڵ����� ������ int���� ������. -��ڽ� //auto unboxing
	}
	
	public static void method1(Integer obj){
	}
	
	public static Integer method2(){
		return 1;
	}
	

}
