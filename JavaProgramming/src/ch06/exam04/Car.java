package ch06.exam04;

public class Car {
	//Field
	Body body=new Body(); //Body 객체 만들어지면서 번지로 들어감 
	Engine engine =new Engine();
	Dashboard dashboard= new Dashboard();
	Seat[] seats={new Seat(),new Seat(),new Seat(),new Seat()};
	Tire[] tires={	new Tire("앞우"),new Tire("앞좌"),new Tire("뒤우"),new Tire("뒤좌")};
	String makeDay;
	String color; //생성자가 실행할때(데이터가만들어질때) 생김
	int speed; //상태데이터.수시로 값이 변함
	
	//Constructor
	Car(String makeDay,String color){
		this.makeDay=makeDay;
		this.color=color;
	}
	
	//Method
	void start(){
		engine.start();
	}
	
	void run(){

		tires[0].roll();
		tires[1].roll();
		tires[2].roll();
		tires[3].roll();
		setSpeed(60); //speed="60"; 
		dashboard.display(60);	
		
	}
		
	void setSpeed(int speed){
		this.speed=speed;
	}
	void stop(){
		engine.stop();
		speed=0;
	}
}
