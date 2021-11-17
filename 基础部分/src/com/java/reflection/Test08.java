package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dong
 * @date 2021/9/28
 * @description    动态的创建对象，通过反射
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.reflection.User");

        // 构造一个对象，本质上是调用了User类的一个无参构造器
        User user = (User) c1.newInstance();
        System.out.println(user);

        // 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("董家乐", 1, 19);
        System.out.println(user2);

        // 通过反射调用普通方法
        User user03 = (User) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // invoke、激活的意思
        // （对象, "方法的值"）
        setName.invoke(user03, "董");
        System.out.println(user03.getName());

        // 通过反射操作属性
        User user04 = (User) c1.newInstance();
        Field name =  c1.getDeclaredField("name");

        // 不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user04,"家");
        System.out.println(user04.getName());

    }
}
