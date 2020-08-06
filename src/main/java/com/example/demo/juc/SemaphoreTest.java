package com.example.demo.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName SemaphoreTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/18 10 37
 * @Version V1.0
 **/
public class SemaphoreTest {

    public static void main(String[] args) {

        //信号量作用是控制多个线程访问时能同时执行的访问线程数。
        Semaphore semaphore = new Semaphore(2);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++) {
            final int j = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("执行"+j);
                        System.out.println("----------------");
                        Thread.sleep(5000);
                        semaphore.release();
                        System.out.println("释放"+j);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             });
        }
        executorService.shutdown();

    }
}

