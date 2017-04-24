package ch10.exam06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		System.out.println("잔고 : " +account.getBalance());
		account.deposit(100000);
		System.out.println("잔고 : " +account.getBalance());
		try {
			account.withdraw(1000000);
		} catch (BalanceInsufficientException e) {
			//예외처리코드
			
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());      //위에서부터 아래로 예외정보 단순화
		}
		System.out.println("잔고 : " +account.getBalance());
		
	}

}
