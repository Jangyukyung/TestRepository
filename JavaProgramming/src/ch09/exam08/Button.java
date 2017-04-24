package ch09.exam08;

public class Button {
	//Field
	private OnClickListener onClickListener;  //인터페이스타입으로 필드 선언
	//Constructor
	
	//Method
	public void setOnClickListener(OnClickListener onClickListener) { //외부에서 인터페이스로 사용가능한 객체가 들어옴
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener!=null){
			onClickListener.onClick();//인터페이스가 실행되는 시점
			
		}
	}
	//Nested Interface
	interface OnClickListener{  //button과 밀접하게 관련
		void onClick();
		
	}


	
}
