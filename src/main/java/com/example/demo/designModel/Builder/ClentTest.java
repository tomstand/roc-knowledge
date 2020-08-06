package com.example.demo.designModel.Builder;

/**
 * @ClassName ClentTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 17 39
 * @Version V1.0
 **/
class ClentTest {
    public static void main(String[] args) {
        Builder builder = new ConcreteProduct();
        Director director = new Director(builder);
        Product construct = director.construct();
        construct.show();
    }
}
