package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.sensor.ThermistorSensor;

public class ThermistorSensorBuzzerTest {

	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591=new PCF8591(0x48, PCF8591.AIN1);
		ThermistorSensor test=new ThermistorSensor(pcf8591);
		
		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_24);

		while(true){
			double value=test.getValue();
//			System.out.println(value+ " C" );
//			Thread.sleep(1000);
			if(value>20){
				System.out.println(value+ " C" );
				Thread.sleep(1000);
				buzzer.on();
				
			}else{
				System.out.println(value+ " C" );
				Thread.sleep(1000);
				buzzer.off();
			}
		}

	}
}