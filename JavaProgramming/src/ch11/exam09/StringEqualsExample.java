package ch11.exam09;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1=new String("유경");
		String strVar2="유경";
		
		if(strVar1==strVar2){
			System.out.println("같은 String 객체를 참조");
		}else{
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)){
			System.out.println("같은 문자열");
		}else{
			System.out.println("다른 문자열");
		}
	}

}
