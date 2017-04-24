/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam26;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Administrator
 */
public class ExcuteExample {
    public static void main(String[] args) throws IOException {
        //스레드풀생성
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        
        for(int i=0;i<1000;i++){
            //작업생성코드
            Runnable task=()->{
                System.out.println(Thread.currentThread().getName()+"작업 처리 ");
            };
            //작업처리지시(작업 큐에 넣기)
            executorService.submit(task);  
        }

        //스레드풀 종료
        System.in.read();
        executorService.shutdownNow(); 
    }
}
