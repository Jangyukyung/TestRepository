package ch09.exam07;

public class Example2{
	public static void main(String[] args){
		//����Ŭ������ �����ϰ� ��ü ����
		/*
		class CImpl implements A.C{
			//C����ϴ� interface�� ������ CImpl�� ����ڴ�.
		@Override
		public void cMethod() {
			System.out.println("CImplt-cMethod()");
			}
		}
		//CImpl cimpl=new CImpl();
		A.C c=new CImpl();
		cimpl.cMethod();
		*/
		A.C c=new A.C(){ //C�� ������ ����Ŭ������ ����µ�, ��ȣ�ȿ� ������ �ְ� , ��ü�� �����Ͽ� ����
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		};
		c.cMethod();
	}
}
