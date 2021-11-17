package com.java.oop.demo04;

// 类  private: 私有
public class Student {

    // 封装属性, 属性(字段)私有, 对象不能直接对该属性操作
    public String name;
    private int age;
    private char sex;

    // 提供一些可以操作私有属性的方法
    // 提供一些public的get、set方法
    // 创建快捷键 alt + insert

    //get 获得这个数据
    public String getName() {
        return name;
    }

    // set 给这个数据设值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // &&与运算   || 或运算
        if (age > 0 && age < 120) {  // 不合法
            this.age = age;
        } else {
            this.age = 3;
        }

    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
