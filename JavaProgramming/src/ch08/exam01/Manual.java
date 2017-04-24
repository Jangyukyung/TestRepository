package ch08.exam01;

public interface Manual {
	//Field
	String COMPANY="삼성전자";
	int MIN_SPEED=0;
	int MAX_SPEED=150;
	int MAX_VOLUME=0; //public static final 생략
	
	//Method
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	int getSpeed();
	void run();  //설명만한다
}
