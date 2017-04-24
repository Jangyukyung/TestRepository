package ch10.exam04;

public class ThrowsExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		/*try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try{
			Class.forName("");
			System.in.read();
		}catch(Exception e){
		}
		
		try{	
			divide(10,0);
		}catch(ArithmeticException e){
			System.out.println("다시");
		}
		
	}
	static void divide(int x, int y)throws ArithmeticException{
		try{	
			int result =x/y;
		}catch(ArithmeticException e){
			System.out.println("0으로 나누어집니다.");
		}
	}
		//int result=x/y;
}
