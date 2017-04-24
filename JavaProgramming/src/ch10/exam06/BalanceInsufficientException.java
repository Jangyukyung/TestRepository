package ch10.exam06;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(){
		super();
	}
	public BalanceInsufficientException(String message){
		super(message);
	}
}
