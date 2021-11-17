package com.java.oop.demo01;

import java.io.IOException;

// Test01 类
public class Demo01 {
    // main 方法
    public static void main(String[] args) {
        int xy = upvalue(5, 3);
        System.out.println(xy);
        Demo01 demo01 = new Demo01();
        System.out.println(demo01.sayHello());
    }
    /*
    修饰符 返回值类型 方法名(...){
        // 方法体
        return 返回值;
    }
    */
    public String sayHello() {
        // 返回值需与返回值类型相同, 即"hello"需与String对应
        return "hello";
    }

    public static int upvalue(int a, int b) {
        return a > b ? a : b;   // 三元运算符
    }

}
