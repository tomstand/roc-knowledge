package com.example.demo.designModel.singleton;

/**
 * @ClassName 懒汉式单例
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/10 14 08
 * @Version V1.0
 **/
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
