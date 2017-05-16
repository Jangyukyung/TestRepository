package hardware.led;


import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class DualColorLed1 {
	//Field
	//디지털 출력핀 필드
	private GpioPinDigitalOutput redPin; 
	//디지털 출력핀 필드 
	private GpioPinDigitalOutput greenPin; 
	
	//Constructor
	public DualColorLed1(Pin redPinNo, Pin greenPinNo){
		//GpioController 객체 얻기
		GpioController gpioController=GpioFactory.getInstance();
		//디지털 출력핀 생성
		redPin=gpioController.provisionDigitalOutputPin(redPinNo);
		//애플리케이션이 종료될 때 출력 모드를 해제하고, 핀의 출력을 LOW(0)
		redPin.setShutdownOptions(true,PinState.LOW);
		
		greenPin=gpioController.provisionDigitalOutputPin(greenPinNo);
		greenPin.setShutdownOptions(true,PinState.LOW);
	}
	//Method
	public void red(){
		redPin.high();
		greenPin.low();
	}
	public void green(){
		redPin.low();
		greenPin.high();
	}
	
	public static void main(String[] args) throws InterruptedException{
		DualColorLed1 test=new DualColorLed1(RaspiPin.GPIO_22, RaspiPin.GPIO_21);
		test.green();
		
		while(true){
			test.red();
			Thread.sleep(1000);
			test.green();
			Thread.sleep(3000);
		}
	}

}
