package ch11.exam14;

public class TypeChangeExample {

	public static void main(String[] args) {
		String v1="100";
		
		byte v2=Byte.parseByte(v1);
		int v3=Integer.parseInt(v1);
		double v4=Double.parseDouble(v1);
		
		String v5="true";
		boolean v6=Boolean.parseBoolean(v5);
		
		String v7=String.valueOf(v3);  //int형 기본값을 문자열로 다시 만들어줌 
		
	}

}
