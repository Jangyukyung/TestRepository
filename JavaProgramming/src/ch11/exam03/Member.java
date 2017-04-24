package ch11.exam03;

public class Member {
	//Field
	private String id;
	
	//Constructor
	public Member(String id){
		this.id=id;
		
	} //외부에서 id를 받아서 그 id를 필드에 저장 
	//Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
