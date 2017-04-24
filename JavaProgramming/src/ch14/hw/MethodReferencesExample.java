package ch14.hw;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator=(x,y)->Calculator.staticMethod(x, y);
		System.out.println("���1: "+operator.applyAsInt(1, 2));
		
		
	}

}
