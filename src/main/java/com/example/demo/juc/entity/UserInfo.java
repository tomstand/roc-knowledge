package com.example.demo.juc.entity;

/**
 * @ClassName UserInfo
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/4/24 16 20
 * @Version V1.0
 **/
public class UserInfo implements  Cloneable{

    private User user;
    private String name;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
