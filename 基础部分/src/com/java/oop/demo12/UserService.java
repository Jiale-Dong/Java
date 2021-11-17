package com.java.oop.demo12;

/**
 * @author dong
 * @date 2021/9/26
 * @description  接口 抽象的思维 ~ Java（架构师）
 */
// interface 定义接口的关键字， 接口都需要有实现类
public interface UserService {

    // 常量  public static final （定义常量不经常用）    类被final修饰后，不能被继承

    public static final int age =  99;

    // 接口中的所有定义其实都是抽象的 abstract
    public abstract void run();
    void add(String name);
    void delete(String name);
    void update(String name);
    void select(String name);
}




