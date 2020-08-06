package com.example.demo.designModel.Builder;

/**
 * @ClassName ConcreteProduct
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 17 39
 * @Version V1.0
 **/
class ConcreteProduct extends  Builder {

    @Override
    public void buildPartA() {
        System.out.println("aaa");
    }

    @Override
    public void buildPartB() {
        System.out.println("bbb");
    }

    @Override
    public void buildPartC() {
        System.out.println("ccc");
    }
}
