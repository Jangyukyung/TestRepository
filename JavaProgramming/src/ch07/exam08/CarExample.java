package ch07.exam08;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car(new SnowTire()); //바로 객체를 생성해서 넣어줌
		//Tire tire=new NormalTire();
		//Car car=new Car(Tire);
		
		car.run();
		
		car.setTire(new NormalTire()); //타입변환발생
		car.run();
		
		car.setTire(new SpeedTire());
		car.run();
		
		car.setTire(new SuperTire());
		car.run();
	}

}
