package ch06.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.field2); //��ü�ȸ���� Ŭ���� �̸������� ����
		Calculator.method2();
		
		Calculator calc=new Calculator();
		System.out.println(calc.field1);//��ü�� �־�� ����� �� ����.
		calc.method1();
		
		System.out.println(calc.field2); //�̷��� ����� ���� ������! Ŭ�����̸����� �����ϴ°��� ����.
		calc.method2();
	}

}
