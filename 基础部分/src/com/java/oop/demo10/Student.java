package com.java.oop.demo10;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */

// static   静态方法或者静态属性
public class Student {


    // 静态变量    多线程
    private static int age;
    // 非静态变量
    private double score;

    public void run(){

    }

    public static void go(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.score);

        // go方法可以直接访问
        Student.go();
        go();

        // 直接使用会报错，需new出来对象才可使用非静态方法
        // run();
        s1.run();

    }

}
