package com.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dong
 * @date 2021/9/28
 * @description  // 分析性能问题
 */
public class Test09 {

    // 普通方式调用
    public static void test01(){
        User user = new User();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endtTime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次- " + (endtTime-startTime) + "ms");

    }
    // 反射方式调用
    public static void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("com.reflection.User");
        User user = (User) c1.newInstance();

        Method getName =  c1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endtTime = System.currentTimeMillis();
        System.out.println("反射方法执行10亿次- " + (endtTime-startTime) + "ms");
    }

    // 反射方式调用，关闭检测
    public static void test03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("com.reflection.User");
        User user = (User) c1.newInstance();

        Method getName =  c1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endtTime = System.currentTimeMillis();
        System.out.println("反射方法（关闭检测）执行10亿次- " + (endtTime-startTime) + "ms");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();

        /*
        普通方法执行10亿次- 4ms
        反射方法执行10亿次- 1585ms
        反射方法（关闭检测）- 执行10亿次1543ms
         */
    }
}
