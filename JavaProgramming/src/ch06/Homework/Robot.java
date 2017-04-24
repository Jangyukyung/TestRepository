package ch06.homework;

public class Robot {
	//Field
	Battery battery=new Battery();
	Head head=new Head();
	Body body=new Body();
	Arm[] arms={new Arm("¿Þ"), new Arm("¿À¸¥")};
	Leg[] legs={new Leg("¿Þ"), new Leg("¿À¸¥")};
	Hand[] hands={new Hand("¿Þ"), new Hand("¿À¸¥")};
	Foot[] feet={new Foot("¿Þ"), new Foot("¿À¸¥")};
	
	String name;
	String robotNumber;
	
	//Constructor
	Robot(String name,String robotNumber){
		this.name=name;
		this.robotNumber=robotNumber;
	}
	//Method
	void on(){
		battery.on();
	}
	
	void move(){
		arms[0].armForward();
		legs[1].legForward();
		
		arms[1].armBackward();
		legs[0].legBackward();
		
		arms[1].armForward();
		legs[0].legForward();
		
		arms[0].armBackward();
		legs[1].legBackward();
		
	}
	
	/*void state(){
		System.out.println(
				"Head: " + head.direction + 
				"Arm: " + arm.direction +
				"Leg: " + leg.direction );
	}
	*/
	void stop(){
		battery.off();
	}
}
