package ch11.exam09;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn="123456-323456";
		char sex=ssn.charAt(7);
		switch(sex){
			case '1':
			case '3':
				System.out.println("����");
				break;
			case '2':
			case '4':
				System.out.println("����");
				break;
				
		}
	}

}
