package ch11.exam17;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
				
		DecimalFormat df = new DecimalFormat("0"); //반올림
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.0"); //소수점 한자리
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0000000000.00000"); //자리수 확보,
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("##########.#####"); //자리수남아도 안채워넣음
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.0"); //소수점 한자리
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#.0"); //앞에 +
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("-#.0"); //앞에 -
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#,###.0"); //콤마
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.0E0"); //10의 몇승
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("\u00A4 #,###"); //(\\u) 유니코드 , A4 원화기호 
		System.out.println( df.format(num) );
	}
}
