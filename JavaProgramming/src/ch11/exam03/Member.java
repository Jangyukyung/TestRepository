package ch11.exam03;

public class Member {
	//Field
	private String id;
	
	//Constructor
	public Member(String id){
		this.id=id;
		
	} //�ܺο��� id�� �޾Ƽ� �� id�� �ʵ忡 ���� 
	//Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
