package ch06.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.field2); //객체안만들고 클래스 이름만으로 접근
		Calculator.method2();
		
		Calculator calc=new Calculator();
		System.out.println(calc.field1);//객체가 있어야 사용할 수 있음.
		calc.method1();
		
		System.out.println(calc.field2); //이렇게 사용할 수도 있지만! 클래스이름으로 접근하는것이 좋음.
		calc.method2();
	}

}
