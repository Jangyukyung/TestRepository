package ch06.exam09;

public class Member {
	String name;
	final String ssn;  //���� �ָ� �����ڸ� ���ؼ� �����Ҽ� ����.
	
	static final String NATION="�ѱ�";
	
	Member(String name,String ssn){
		this.name=name;
		this.ssn=ssn;
	}
}
