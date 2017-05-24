package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.RgbLedPWM;
import hardware.sensor.FlameSensor;
import hardware.sensor.PhotoresistorSensor;

public class FlameSensorBuzzerRgbLedTest {
	public static void main(String[] args) throws Exception{
		PCF8591 pcf8591=new PCF8591(0x48, PCF8591.AIN0);
		PhotoresistorSensor photo=new PhotoresistorSensor(pcf8591);
		FlameSensor flame=new FlameSensor(pcf8591,RaspiPin.GPIO_01);
		
		RgbLedPWM test = new RgbLedPWM(RaspiPin.GPIO_00, RaspiPin.GPIO_02, RaspiPin.GPIO_03);

		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_29);
		
		
		flame.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState() == PinState.LOW){
					System.out.println("***** 화재 발생 *****");
					
					
					
				}else{
					System.out.println("***** 정상 상태 *****");
					
					
				}
			}
		});
		
		
		while(true){
			
			double value=flame.getValue();
			
			System.out.println(value  );
			//Thread.sleep(1000);
			
			if(value<30)
			{
				test.ledColorSet(255,0,0);
				buzzer.on();
			}else{
				test.ledColorSet(0, 255, 0);buzzer.off();
			}
		}
	}
	
}
