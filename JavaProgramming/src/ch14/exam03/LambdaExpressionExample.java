package ch14.exam03;

public class LambdaExpressionExample {
	public static int a=5;
	
	public static void main(String[] args) {
		method1(() ->{
			a=8;  //필드변경가능
			System.out.println(a);
		});
		
		int b=5;
		method1(() ->{
			//b=8;  //변경불가능-final특성가지기때문
			System.out.println(b);
		});
	}
	
	public static void method1(FunctionalInterface1 i){
		i.method();
	}
	

}
