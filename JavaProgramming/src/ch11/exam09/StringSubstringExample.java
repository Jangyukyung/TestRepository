package ch11.exam09;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn="123465-1324561";
		
		String firstNum=ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);
	}

}
