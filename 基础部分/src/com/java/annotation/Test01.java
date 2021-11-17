package com.java.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dong
 * @date 2021/9/26
 * @description 注解：检查和约束作用
 */

// 什么是注解：加上注解就要重写父类的方法
@SuppressWarnings("all")
public class Test01 extends Object{
    // @Override 重写的注解
    @Override
    public String toString(){
        return super.toString();
    }

    // Deprecated 不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

//    @SuppressWarnings("all")
    public static void test02(){

        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
        test02();
    }
}
