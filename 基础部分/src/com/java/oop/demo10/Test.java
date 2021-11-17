package com.java.oop.demo10;

// 静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

/**
 * @author dong
 * @date 2021/9/25
 * @description  静态导入包： 省略 Math.random() 中的Math
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
    }
}


