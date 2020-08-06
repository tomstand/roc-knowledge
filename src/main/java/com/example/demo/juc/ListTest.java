package com.example.demo.juc;

import com.example.demo.juc.entity.User;
import com.example.demo.juc.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/4/24 16 16
 * @Version V1.0
 **/
public class ListTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User();
        user.setName("111");
        UserInfo userInfo = new UserInfo();
        userInfo.setName("111");
        userInfo.setUser(user);

        UserInfo userInfo1 = (UserInfo) userInfo.clone();
//        userInfo1.setName("222");
//        userInfo1.setUser(user);

        userInfo1.setName("222");
        userInfo1.getUser().setName("222");

        System.out.println(userInfo.getName());
        System.out.println(userInfo.getUser().getName());
        System.out.println(userInfo1.getName());
        System.out.println(userInfo1.getUser().getName());

        user = new User();
        user.setName("111");

        List<User> userList = new ArrayList<>();
        userList.add(user);

        List<User> userList1 = new ArrayList<>();
        userList1.add((User) user.clone());

        userList.get(0).setName("222");

        System.out.println(userList.get(0).getName());
        System.out.println(userList1.get(0).getName());

    }
}
