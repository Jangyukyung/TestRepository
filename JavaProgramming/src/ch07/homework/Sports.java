package ch07.homework;

public class Sports extends Car{
	@Override 
	public void speedUp(){
		speed +=10;
	}
	@Override
	public void stop(){
		System.out.println("½ºÆ÷Ã÷Ä«¸¦ ¸ØÃã");
		speed=0;
	}
}