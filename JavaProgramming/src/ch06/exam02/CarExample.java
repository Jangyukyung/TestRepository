package ch06.exam02;

public class CarExample {

	public static void main(String[] args) {

		Car myCar=new Car();
		System.out.println(myCar.company);  //myCar의 company에 무슨값이 저장되어있는지 출력
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		Car yourCar=new Car("검정",true);
		System.out.println(yourCar.company);  //myCar의 company에 무슨값이 저장되어있는지 출력
		System.out.println(yourCar.speed);
		System.out.println(yourCar.color);
		System.out.println(yourCar.airback);
		
		yourCar=new Car("빨강",false);
		System.out.println(yourCar.company);  //myCar의 company에 무슨값이 저장되어있는지 출력
		System.out.println(yourCar.speed);
		System.out.println(yourCar.color);
		System.out.println(yourCar.airback);
	}

}
