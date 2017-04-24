package ch06.exam08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc1=Calculator.getInstance(); //클래스로 접근
		Calculator calc2=Calculator.getInstance();
		Calculator calc3=Calculator.getInstance();
		Calculator calc4=Calculator.getInstance();
		Calculator calc5=Calculator.getInstance();
	}//객체는 하나생성(singleton). 계속 singleton객체 번지 리턴함

}
