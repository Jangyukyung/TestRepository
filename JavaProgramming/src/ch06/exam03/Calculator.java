package ch06.exam03;

//import ch06.exam02.Car;  //include �� ���

public class Calculator {
	//Field
	
	
	//Constructor
	
	//Method
	void powerOn(){
		System.out.println("������ �մϴ�.");
	}
	void powerOff(){
		System.out.println("������ ���ϴ�.");
	}
	String info(){
		return "�Ｚ����-20117-03-28";
	}
	int plus(int x,int y){
		int result=x+y;
		return result;
	}
	double plus(double x,double y){
		double result=x+y;
		return result;
	}
	
	double divide(double x, double y){
		double result=x/y;
		return result;
	}
	
	int[] changeArray(int x,int y,int z){
		int[] array={x,y,z};
		return array;
	}
	Car makeCar(String color,boolean airback){
		Car car=new Car(color,airback); //����ִ� Car�� ������ΰ�
		return car; //���� car�� ����
	}
}