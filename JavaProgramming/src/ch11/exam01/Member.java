package ch11.exam01;

public class Member {
	//Field
	private String id;
	
	//Constructor
	public Member(String id){
		this.id=id;
		
	} //�ܺο��� id�� �޾Ƽ� �� id�� �ʵ忡 ���� 
	//Method
	@Override
	public boolean equals(Object obj) { //�ڹ��� ��� ��ü ���ü� ����
		if(obj instanceof Member){
			Member target=(Member)obj; //obj�� MemberŸ������ ����ȯ
			if(id.equals(target.id)){ //���ڿ���
				return true;
			}
		}
			return false;
	}
}