package ch11.exam05;

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
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(id+" 가 제거됨");
	}
}
