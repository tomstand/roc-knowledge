package com.example.demo.designModel.Builder;

/**
 * @ClassName Builder
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/6 17 39
 * @Version V1.0
 **/
abstract class Builder {

    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }

}
