package com.example.demo.designModel.Builder;

/**
 * @ClassName Director
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 17 39
 * @Version V1.0
 **/
class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
