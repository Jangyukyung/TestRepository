package ch07.exam08;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car(new SnowTire()); //�ٷ� ��ü�� �����ؼ� �־���
		//Tire tire=new NormalTire();
		//Car car=new Car(Tire);
		
		car.run();
		
		car.setTire(new NormalTire()); //Ÿ�Ժ�ȯ�߻�
		car.run();
		
		car.setTire(new SpeedTire());
		car.run();
		
		car.setTire(new SuperTire());
		car.run();
	}

}
