package com.java.oop.demo02;

// 学生类 = 属性+方法
public class Student {
    // 属性: 字段
    String name; // null 未赋值之前
    int age;  // 0 未赋值之前


    // 方法
    public void study(){
        System.out.println(this.name + "在学习");
    }
}
