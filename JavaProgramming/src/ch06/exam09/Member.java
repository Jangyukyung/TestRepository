package ch06.exam09;

public class Member {
	String name;
	final String ssn;  //값을 주면 생성자를 통해서 변경할수 없음.
	
	static final String NATION="한국";
	
	Member(String name,String ssn){
		this.name=name;
		this.ssn=ssn;
	}
}
