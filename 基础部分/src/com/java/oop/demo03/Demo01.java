package com.java.oop.demo03;


/*
可变参数：本质即数组
1. JDK1.5之后，Java支持传递同类型的可变参数传递给一个方法；
2. 方法声明之后，在指定参数类型后加一个省略号...;
3. 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数

 */

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.test(10,2,3,5,1,2);
    }

    public void test(int... i){
        System.out.println(i[3]);

    }

}
