package ch06.exam08;

public class Calculator {
	//Field
	private static Calculator singleton=new Calculator(); //�ڱ��ڽ� Ÿ�� �ʵ�  //�ܺο��� ���ٸ��ϰ� private
	
	//Constructor
	private Calculator(){
		
	}

	static Calculator getInstance(){ //�� Ŭ���� �ۿ��� ���� ���� 
		return singleton;
	}
	//Method
	
}
