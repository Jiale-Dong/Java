package com.java.oop.demo12;

/**
 * @author dong
 * @date 2021/9/26
 * @description 类实现接口
 */
// 抽象类：extends~
// 类 实现接口 implements 接口
// 实现了接口的类，就需要重写接口中的方法
// 多继承~利用接口实现伪多继承
public class UserServiceImpl implements UserService, TimeService {
    @Override
    public void run() {
        System.out.println("hello");
    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void select(String name) {

    }

    @Override
    public void timer() {
        System.out.println("现在已经九点了");
    }

    public static void main(String[] args) {
        // 通过类名.变量直接获取接口中的变量
        System.out.println(UserServiceImpl.age);
        UserServiceImpl s1 = new UserServiceImpl();
        s1.run();
        s1.timer();

    }

}
