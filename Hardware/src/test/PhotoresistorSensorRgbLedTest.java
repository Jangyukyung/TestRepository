package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.led.RgbLedPWM;
import hardware.sensor.PhotoresistorSensor;

public class PhotoresistorSensorRgbLedTest {
	public static void main(String[] args) throws Exception{
		PCF8591 pcf8591=new PCF8591(0x48, PCF8591.AIN0);
		PhotoresistorSensor photo=new PhotoresistorSensor(pcf8591);
		
		RgbLedPWM test = new RgbLedPWM(RaspiPin.GPIO_00, RaspiPin.GPIO_02, RaspiPin.GPIO_03);


		
		while(true){
			double value=photo.getValue();
			
			test.ledColorSet(255, 0, 0);
			System.out.println(value);
			Thread.sleep(1000);
			
			if(value>100){
				test.ledColorSet(0,255,0);
				System.out.println(value);
				Thread.sleep(1000);
			}
			
		}
		
		

	}
	
}
