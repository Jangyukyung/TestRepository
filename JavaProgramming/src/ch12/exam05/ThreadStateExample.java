package ch12.exam05;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
//StatePrintlThread객체를 TargetThread생성자매개값으로 만듬