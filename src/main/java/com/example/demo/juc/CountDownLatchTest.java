package com.example.demo.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CountDownLatchTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/15 15 02
 * @Version V1.0
 **/
public class CountDownLatchTest {



    public static void main(String[] args) {

        //计数作用是控制等待前置线程执行完后再执行主线程
        CountDownLatch countDownLatch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                countDownLatch.countDown();
                System.out.println("子线程一执行");
            }
        });
        executorService.shutdown();

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                countDownLatch.countDown();
                System.out.println("子线程二执行");
            }
        });
        executorService1.shutdown();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行");

    }
}
