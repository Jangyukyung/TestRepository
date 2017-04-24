package ch11.exam17;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
				
		DecimalFormat df = new DecimalFormat("0"); //�ݿø�
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.0"); //�Ҽ��� ���ڸ�
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0000000000.00000"); //�ڸ��� Ȯ��,
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("##########.#####"); //�ڸ������Ƶ� ��ä������
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.0"); //�Ҽ��� ���ڸ�
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#.0"); //�տ� +
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("-#.0"); //�տ� -
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#,###.0"); //�޸�
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.0E0"); //10�� ���
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("\u00A4 #,###"); //(\\u) �����ڵ� , A4 ��ȭ��ȣ 
		System.out.println( df.format(num) );
	}
}
