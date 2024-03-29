package com.java.reflection;

/**
 * @author dong
 * @date 2021/9/27
 * @description 类加载内存分析
 */
public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /*
        1. 加载到内存，会产生一个类对应Class对象
        2. 链接，链接结束后m = 0
        3. 初始化
            <clinit>(){
                System.out.println("A类静态代码块初始化");
                m = 300;
                m = 100;
            }
            ===> m=100;
         */
    }
}

class A{
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    // 初始化的时候, 合并代码块
    /*
    m = 300;
    m = 100;
     */

    static int m =100;

    public A() {
        System.out.println("A类的无参构造初始化");
    }
}
