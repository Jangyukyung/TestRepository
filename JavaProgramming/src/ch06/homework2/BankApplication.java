/*package ch06.homework2;

import ch06.homework2.Account2;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray=new Account[100];
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run){
			System.out.println("----------------------------------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("----------------------------------------------");
			System.out.println("����> ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1){
				createAccount();
				
			}
		}
	}
	
	
	
	private static void createAccount(){
		System.out.println("-----");
		System.out.println("���»���");
		System.out.println("-----");
		System.out.println("���¹�ȣ: ");
		String ano=scanner.next();
		
		
		Account newAccount=new Account(ano,owner,balance);
		for(int i=0;i<accountArray.length;i++){
			if(accountArray[i]==null){
				accountArray[i]=newAccount;
				System.out.println(" ");
				break;
			}
		}
	}
	
	
	private static void accountList(){
		
		for(int i=0; i<accountArray.length;i++){
			Account account=accountArray[i];
			if(account!=null){
				System.out.println(account.getAno());
				
			}
		}
	}
	
	
}
*/
