package ch11.exam06;

public class TimeExample {

	public static void main(String[] args) {
		int sum=0;
		
		//long startTime=System.currentTimeMillis();  //현재시간의 long값 
		long startTime=System.nanoTime();
		for(int i=0;i<10000;i++){
			sum+=i;
		}
		//long endTime=System.currentTimeMillis();
		long endTime=System.nanoTime();
				
		System.out.println(endTime-startTime);
	}

}
