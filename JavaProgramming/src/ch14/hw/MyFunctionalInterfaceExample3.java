package ch14.hw;

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		fi=new MyFunctionalInterface3() {
			@Override
			public int method(int x, int y ) {
				return x+y;
				
			}
		};
		
		fi=(x,y)->{
			int result=x+y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi=(x,y)->{
			return x+y; };
		System.out.println(fi.method(2,5));
		
		fi=(x,y)->x+y;
			System.out.println(fi.method(2, 5));
		
	}
}
