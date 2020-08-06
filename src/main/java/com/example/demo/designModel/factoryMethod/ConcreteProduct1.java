package com.example.demo.designModel.factoryMethod;

/**
 * @ClassName ConcreteProduct1
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 15 58
 * @Version V1.0
 **/ //具体工厂1
class ConcreteProduct1 implements Product{

    @Override
    public void show() {
        System.out.println("产品111");
    }
}
