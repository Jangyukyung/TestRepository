package ch06.exam03;

//import ch06.exam02.Car;  //include 와 비슷

public class Calculator {
	//Field
	
	
	//Constructor
	
	//Method
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	String info(){
		return "삼성전자-20117-03-28";
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
		Car car=new Car(color,airback); //어디에있는 Car를 만들것인가
		return car; //만든 car의 번지
	}
}
