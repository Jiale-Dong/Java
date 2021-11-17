package com.java.reflection;

/**
 * @author dong
 * @date 2021/9/28
 * @description  测试什么时候会发生类的初始化
 */
public class Test05 {

    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 主动引用
        //Son son = new Son(); // 如果其父类没有被初始化，则先会初始化他的父类
        //Class.forName("com.reflection.Son"); // 反射也会产生主动引用

        // 调用类的静态成员（除了final常量）和静态方法，会发生类的初始化
        System.out.println(Son.m);

        // 以上三次引用不会执行两次，因为初始化只进行一次

        // 2. 不会产生类的引用的方法
        //System.out.println(Son.b);

        // 只是名字和空间 不会发生Son的初始化
        //Son[] array = new Son[6];
        // 引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）
        //System.out.println(Son.M);


    }
}


class Father{

    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 300;
    static final int M = 1;
}
