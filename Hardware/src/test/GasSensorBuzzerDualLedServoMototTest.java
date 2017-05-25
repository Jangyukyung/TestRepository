package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.motor.SG90Servo;
import hardware.sensor.GasSensor;

public class GasSensorBuzzerDualLedServoMototTest {
	public static void main(String[] args) throws Exception{
		PCF8591 pcf8591=new PCF8591(0x48, PCF8591.AIN0);
		GasSensor gas=new GasSensor(pcf8591,RaspiPin.GPIO_00);
		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_29);
		DualColorLed led=new DualColorLed(RaspiPin.GPIO_03, RaspiPin.GPIO_02);
		SG90Servo motor=new SG90Servo(RaspiPin.GPIO_01 , 8, 25);

		
		
		
		gas.setGpioPinListenerDigital(new GpioPinListenerDigital() {
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
			double value=gas.getValue();
			
			System.out.println(value  );
			Thread.sleep(1000);

			if(value>100)
			{
				led.red();
				buzzer.on();
				motor.setAngle(180);
			}else{
				led.green();
				buzzer.off();
				motor.setAngle(0);
			}
		}
	}
	
}
