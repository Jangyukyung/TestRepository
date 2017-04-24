

package ch17.hw.ex02;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteExample {
    public static void main(String[] args) throws IOException {
        //스레드풀 생성
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        //작업 생성코드
        for(int i=0;i<1000;i++){
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName()+"작업처리");
        };
         //작업 처리지시 작업큐에 넣기 
        executorService.submit(task);
        }
        
        
  
        
        //스레드풀 종료-스레드풀의 스레드는 기본적으로 데몬 스레드가 인다. main 스레드가 종료되더라도 스레드 풀의 스레드는 작업을 처리하기 위해 계속실행된다.
        System.in.read();
        executorService.shutdownNow();//셧다운 시켜라 
        
    }
}
