package ch11.exam14;

public class WrapperEqualsExample {

	public static void main(String[] args) {
		Integer v1=1000;
		Integer v2=1000;
		
		//System.out.println(v1==v2); //객체 비교 -기본타입이 아닐경우 쓰지말자
		//System.out.println(v1.equals(v2)); //값 비교
		System.out.println(v1.intValue()==v2.intValue()); //값 비교
	}

}
