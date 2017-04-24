package ch06.homework;

public class RobotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot myRobot=new Robot("자바자바","602");
		
		myRobot.battery.on();
		
		//System.out.println(myRobot.arms[0].direction);
		
		myRobot.head.headUp();
		myRobot.head.headDown();
		myRobot.head.headLeft();
		myRobot.head.headRight();
		
		//myRobot.state();
		
		myRobot.move();
		
		myRobot.battery.off();
	}

}
