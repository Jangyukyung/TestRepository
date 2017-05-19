package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.sensor.TrackingSensor;
import java.io.IOException;

public class TrackingSensorBuzzerTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		TrackingSensor tracking = new TrackingSensor(RaspiPin.GPIO_00);

		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_01);

		
		tracking.setGpioPinListenerDigital(event ->{
			if(event.getState()==PinState.HIGH){
				System.out.println("black");
				test.off();
			}else{
				System.out.println("white");
				test.on();
			}
		});
		System.out.println("ready!");
		System.in.read();

		
	}
}