package ch11.exam02;

public class Key {
	private int number;
	
	public Key(int number){
		this.number=number;
		
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key){
			Key target=(Key)obj; //obj를 Member타입으로 형변환
			if(number==target.number){ //int형이므로 == 로 비교
				return true;
			}
		}
			return false;
	}
}
