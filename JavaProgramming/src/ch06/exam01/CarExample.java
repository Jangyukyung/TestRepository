package ch06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 코드
		Car myCar=new Car();
		//객체의 메소드 호출
		myCar.run();
		//객체의 필드값을 읽기
		System.out.println(myCar.company);  //myCar의 company에 무슨값이 저장되어있는지 출력
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		//객체의 필드값을 변경
		myCar.speed=30;
		myCar.color="흰색";
		myCar.run();
		
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		
		//---------------------------------------
		Car yourCar=new Car();
		System.out.println(yourCar.company);  //myCar의 company에 무슨값이 저장되어있는지 출력
		System.out.println(yourCar.speed);
		System.out.println(yourCar.color);
		System.out.println(yourCar.airback);
	}

}
