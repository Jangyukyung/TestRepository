package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.sensor.UltrasonicSensor;
import java.io.IOException;

public class UltrasonicSensorBuzzer {

	public static void main(String[] args) throws IOException, InterruptedException {
		UltrasonicSensor ultra = new UltrasonicSensor(RaspiPin.GPIO_28, RaspiPin.GPIO_29);

		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_24);

		
		while (true) {
			int distance = ultra.getDistance();
			System.out.println("거리" + distance);
			
			
			if(distance<20){
				test.on();
			}else{
				test.off();
			}
		}
		

		
	}
}