package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author dong
 * @date 2021/9/28
 * @description  获得类的信息
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.reflection.User");  // 抛出没有类异常

        // 或者通过对象获得类
        // c1 = new User().getClass();

        // 获得类的名字
        System.out.println("================获得类的名字==================");
        System.out.println(c1.getName());  // 获得包名 + 类名
        System.out.println(c1.getSimpleName());  // 仅获得类名

        // 获得类的属性
        System.out.println("================获得类的属性==================");
        Field[] fields = c1.getFields();  // 只能找到public属性
        fields = c1.getDeclaredFields();  // 找到全部属性

        for(Field field:fields){
            System.out.println(field);
        }

        Field name = c1.getDeclaredField("name");   // 抛出没有属性异常
        System.out.println(name);

        // 获得类的方法
        System.out.println("================获得类的方法==================");
        Method[] methods =  c1.getMethods(); // 获得本类及其父类的全部public方法
        for(Method method:methods){
            System.out.println("正常的方法:" + method);
        }
        methods =  c1.getDeclaredMethods();  // 获得本类的所有方法
        for(Method method:methods){
            System.out.println("getDeclaredMethods:" + method);
        }

        // 获得指定方法
        System.out.println("================获得指定方法==================");
        // getName()方法默认参数值为空
        Method getName =  c1.getMethod("getName",null); // 抛出没有方法异常
        Method setName =  c1.getMethod("setName",String.class); // 抛出没有方法异常
        System.out.println(getName);
        System.out.println(setName);

        // 获得指定构造器
        System.out.println("================获得指定构造器==================");
        Constructor[] constructors =  c1.getConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }
        constructors =  c1.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }

        // 获得指定的有参构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println("通过反射获取指定的有参构造器" + declaredConstructor);
    }
}
