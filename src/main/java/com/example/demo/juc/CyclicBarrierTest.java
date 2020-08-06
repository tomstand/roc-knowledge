package com.example.demo.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CyclicBarrierTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/18 11 08
 * @Version V1.0
 **/
public class CyclicBarrierTest {

    public static void main(String[] args) {

        //栅栏作用是控制多个线程访问时能同时执行的访问线程数。
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println(212);
            }
        });

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i=0;i<4;i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.println("到达one");
                        cyclicBarrier.await();
//                        System.out.println("突破one");
                        Thread.sleep(2000);
                        System.out.println("到达two");
                        cyclicBarrier.await();
                        Thread.sleep(2000);
//                        System.out.println("突破two");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });
        }


    }
}
