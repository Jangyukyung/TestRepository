package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.button.Button;
import hardware.led.DualColorLed;
import hardware.led.RgbLedDigital;
import java.io.IOException;

public class ButtonTest {
	public static void main(String[] args) throws IOException{
		Button button1=new Button(RaspiPin.GPIO_00);
		Button button2=new Button(RaspiPin.GPIO_02);
		Button button3=new Button(RaspiPin.GPIO_03);
		RgbLedDigital test=new RgbLedDigital(RaspiPin.GPIO_27, RaspiPin.GPIO_28, RaspiPin.GPIO_29);
	
		button1.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState()==PinState.HIGH){
					System.out.println("high");
					test.red(true);
				}else{
					System.out.println("low");
					test.red(false);
				}
			}
		});
		button2.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState()==PinState.HIGH){
					System.out.println("high");
					test.green(true);
				}else{
					System.out.println("low");
					test.green(false);
				}
			}
		});
		button3.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState()==PinState.HIGH){
					System.out.println("high");
					test.blue(true);
				}else{
					System.out.println("low");
					test.blue(false);
				}
			}
		});
		System.out.println("Ready.....");
		System.in.read();

	}
	
}
