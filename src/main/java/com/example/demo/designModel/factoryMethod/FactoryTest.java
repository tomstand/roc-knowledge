package com.example.demo.designModel.factoryMethod;

/**
 * @ClassName AbstractFactoryTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 15 43
 * @Version V1.0
 **/
public class FactoryTest {

    public  Product getProduct(Integer type) {
        switch (type) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        FactoryTest factoryTest = new FactoryTest();
        Product product = factoryTest.getProduct(1);
        product.show();
        product = factoryTest.getProduct(2);
        product.show();

    }

}


