package com.java.oop.demo10;

/**
 * @author dong
 * @date 2021/9/25
 * @description 代码块执行先后顺序：静态代码块 > 匿名代码块 > 构造方法
 */

// 类被final修饰后，不能被继承
public class Persion {

    // 2. 附初始值
    {
        // 代码块（匿名代码块）
        System.out.println("匿名代码块");
    }

    // 1. 只执行一次
    static {
        // 静态代码块
        System.out.println("静态代码块");
    }

    // 3.
    public Persion(){
        System.out.println("无参构造方法");
    }

    public static void main(String[] args) {
        Persion s1 = new Persion();
        System.out.println("=====================>");
        Persion s2 = new Persion();
    }

}

