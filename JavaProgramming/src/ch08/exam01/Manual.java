package ch08.exam01;

public interface Manual {
	//Field
	String COMPANY="�Ｚ����";
	int MIN_SPEED=0;
	int MAX_SPEED=150;
	int MAX_VOLUME=0; //public static final ����
	
	//Method
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	int getSpeed();
	void run();  //�����Ѵ�
}
