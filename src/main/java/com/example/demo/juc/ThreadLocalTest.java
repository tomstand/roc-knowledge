package com.example.demo.juc;

/**
 * @ClassName ThreadLocalTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/15 09 58
 * @Version V1.0
 **/
public class ThreadLocalTest {

    //本地线程作用是控制变量在同一个线程内部可以识别，线程结束后会自动销毁
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            System.out.println("初始化方法");
            return super.initialValue();
        }
    };




    public static void main(String[] args) {


        new Thread(new Runnable() {


            @Override
            public void run() {

                for(int i=0;i<5;i++) {
                    if(threadLocal.get()==null) {
                        threadLocal.set("a");
                    } else {
                        threadLocal.set(threadLocal.get()+"a");
                        System.out.println(threadLocal.get());
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=0;i<5;i++) {
                    if(threadLocal.get()==null) {
                        threadLocal.set("b");
                    } else {
                        threadLocal.set(threadLocal.get()+"b");
                        System.out.println(threadLocal.get());
                    }
                }

            }
        }).start();

    }
}
