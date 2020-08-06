package com.example.demo.designModel.factoryMethod;

/**
 * @ClassName AbstractFactoryTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 15 59
 * @Version V1.0
 **/
public  class AbstractFactoryTest {

    public static FactoryTest getFactory() {
        return new FactoryTest();
    }

    public static void main(String[] args) {
        FactoryTest factoryTest = getFactory();
        Product product = factoryTest.getProduct(1);
        product.show();
    }

}


