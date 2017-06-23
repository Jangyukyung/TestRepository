package hardware.motor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class DCMotor {
	//Field
	//정방향/역방향 제어
	private GpioPinDigitalOutput out1; //RaspiPin.GPIO_00
	private GpioPinDigitalOutput out2; //PaspiPin.GPIO_01
	//PWM으로 속도 제어
	private PCA9685 pca9685;
	private Pin pwm; //PCA9685.PWM_00~PCA9685.PWM_15
	
	//Constructor
	public DCMotor(Pin out1, Pin out2, PCA9685 pca9685, Pin pwm){
		GpioController gpioController=GpioFactory.getInstance();
		
		this.out1=gpioController.provisionDigitalOutputPin(out1, PinState.LOW);
		this.out1.setShutdownOptions(true, PinState.LOW);
		
		this.out2=gpioController.provisionDigitalOutputPin(out2, PinState.LOW);
		this.out2.setShutdownOptions(true, PinState.LOW);
		
		this.pca9685=pca9685;
		this.pwm=pwm;
		
	}
	
	//Method
	public void setSpeed(int step){
		//ste : 0~4095 (총 4096단계)
		pca9685.setStep(pwm, step);
	}
	
	public void forward(){
		out1.high();
		out2.low();
	}
	
	public void backward(){
		out1.low();
		out2.high();
		
	}
	
	public void stop(){
		out1. low();
		out2.high();
		setSpeed(0);
	}

	public static void main(String[] args) throws Exception {
		PCA9685 pca9685=PCA9685.getInstance();
		
		DCMotor motorA=new DCMotor(RaspiPin.GPIO_00, RaspiPin.GPIO_01, pca9685,PCA9685.PWM_05);
		DCMotor motorB=new DCMotor(RaspiPin.GPIO_02, RaspiPin.GPIO_03, pca9685,PCA9685.PWM_04);

	
//		motorA.forward();
//		motorA.setSpeed(4095);
//		
//		motorB.forward();
//		motorB.setSpeed(4095);
		
		motorA.backward();
		motorA.setSpeed(4095);
		
		motorB.backward();
		motorB.setSpeed(4095);
		
		Thread.sleep(5000);
		
		
		
		motorA.stop();
		motorB.stop();
	}
}
