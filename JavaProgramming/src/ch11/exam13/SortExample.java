package ch11.exam13;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		String[] names={"홍길동","김민수","박동수"};
		
		System.out.println(Arrays.toString(names));
		
		//올림차순으로 정렬
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		//내림차순으로 정렬
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
		Member[] members={
				new Member("홍길동",20),
				new Member("김민수",15),
				new Member("박동수",25)
		};
		System.out.println(Arrays.toString(members)); //members객체를 넣었을때 이거에 대한 문자열을 출력
		//올림차순으로
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		//내림차순으로
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}

}
