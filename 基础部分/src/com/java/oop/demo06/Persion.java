package com.java.oop.demo06;

/**
 * @author dong
 * @date 2021/9/24
 * @description Persion类、父类
 */
public class Persion {
    protected String name = "le";

    // new一个对象先走无参构造器
    public Persion() {
        System.out.println("Persion无参构造被执行了");

    }

    // 私有的东西无法被继承
    public void print(){
        System.out.println("Persion");
    }

    }
