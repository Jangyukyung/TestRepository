package ch09.exam08;

public class Button {
	//Field
	private OnClickListener onClickListener;  //�������̽�Ÿ������ �ʵ� ����
	//Constructor
	
	//Method
	public void setOnClickListener(OnClickListener onClickListener) { //�ܺο��� �������̽��� ��밡���� ��ü�� ����
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener!=null){
			onClickListener.onClick();//�������̽��� ����Ǵ� ����
			
		}
	}
	//Nested Interface
	interface OnClickListener{  //button�� �����ϰ� ����
		void onClick();
		
	}


	
}
