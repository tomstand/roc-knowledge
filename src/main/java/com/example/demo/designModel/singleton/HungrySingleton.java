package com.example.demo.designModel.singleton;

/**
 * @ClassName 饿汉式单例
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/10 14 14
 * @Version V1.0
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private  HungrySingleton(){}

    public static  HungrySingleton getInstance() {
        return  instance;
    }
}
