package ch10.exam05;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(){
		super();
	}
	public BalanceInsufficientException(String message){
		super(message);
	}
}
