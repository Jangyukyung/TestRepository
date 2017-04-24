package ch07.exam07;

public class PolymorphismExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire1=new Tire();
		NormalTire tire2=new NormalTire();
		SnowTire tire3=new SnowTire();
		
		run(tire1);
		run(tire2); //Tire tire = tire2;
		run(tire3); //Tire tire = tire3;
	}
	
	static void run(Tire tire){
		tire.roll();//tire 1을 넣으면 Tire의 roll
		//tire2를 넣으면 NormalTire의 roll
		//tire3을 넣으면 SnowTire의 roll
	}
}
