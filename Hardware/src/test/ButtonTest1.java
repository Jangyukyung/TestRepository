package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.button.Button;
import hardware.led.DualColorLed;
import java.io.IOException;

public class ButtonTest1 {
	public static void main(String[] args) throws IOException{
		Button button=new Button(RaspiPin.GPIO_00);
		DualColorLed test=new DualColorLed(RaspiPin.GPIO_28, RaspiPin.GPIO_29);
	
		button.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState()==PinState.HIGH){
					System.out.println("high");
					test.red();
				}else{
					System.out.println("low");
					test.green();
				}
			}
		});
		System.out.println("Ready.....");
		System.in.read();

	}
	
}
