package ch11.exam10;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text="홍길동/이수홍/박연수";
		
		StringTokenizer st=new StringTokenizer(text,"/");
		int countTokens=st.countTokens(); //꺼내지 않고 남아있는 토큰 수
		for(int i=0;i<countTokens;i++){
			String token=st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st=new StringTokenizer(text,"/");
		while(st.hasMoreTokens()){ //남아있는 토큰이 있는지 여부
			String token=st.nextToken(); //토큰 하나씩 꺼내옴
			System.out.println(token);
			
		}
	}

}
