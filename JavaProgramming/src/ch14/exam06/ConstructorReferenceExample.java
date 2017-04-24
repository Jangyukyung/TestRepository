package ch14.exam06;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		createMember(new FunctionalInterface() {
			
			@Override
			public Member createMember(String mid, String mname) {
				Member member=new Member(mid,mname);
				return member;
			//	return new Member(mid,mname);
			}
		});
		createMember((mid,mname)-> {return new Member(mid,mname);});
		createMember((mid,mname)-> new Member(mid,mname));
		createMember(Member::new); //생성자 참조
	}

	public static void createMember(FunctionalInterface i){
		Member member=i.createMember("white", "홍길동");
	}
}
