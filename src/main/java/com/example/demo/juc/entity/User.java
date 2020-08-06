package com.example.demo.juc.entity;

/**
 * @ClassName User
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/4/24 16 16
 * @Version V1.0
 **/
public class User implements  Cloneable{

    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
