package com.java.oop.demo02;


public class Application {
    public static void main(String[] args) {

        /*
        类：抽象的、实例化
        类实例化后返回一个自己的对象;
        xiaoming对象就是一个Student类的具体实例
        * */
        Student xiaoming = new Student();
        Student hong = new Student();

        // 构造方法.txt
        Persion persion = new Persion("dongjiale");
        System.out.println(persion.name);

        xiaoming.name = "xiaoming";
        xiaoming.age = 10;

        hong.name = "xiaohong";
        hong.age = 20;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        System.out.println(hong.name);
        System.out.println(hong.age);

    }
}
