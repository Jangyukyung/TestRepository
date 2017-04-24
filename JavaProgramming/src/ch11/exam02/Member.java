package ch11.exam02;

public class Member {
	//Field
	private String id;
	
	//Constructor
	public Member(String id){
		this.id=id;
		
	} //외부에서 id를 받아서 그 id를 필드에 저장 
	//Method
	@Override
	public int hashCode() {
		return id.hashCode();//문자열이 같으면 항상 같은 해시코드
	}
	
	@Override
	public boolean equals(Object obj) { //자바의 모든 객체 들어올수 있음
		if(obj instanceof Member){
			Member target=(Member)obj; //obj를 Member타입으로 형변환
			if(id.equals(target.id)){ //문자열비교
				return true;
			}
		}
			return false;
	}
	
}
