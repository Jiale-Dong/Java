package com.java.oop.demo08;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */
public class Application {
    public static void main(String[] args) {

        // 一个对象的实际类型是确定的
        // new Student();
        // new Persion();

        // 可以指向的引用类型(Student、Persion、Object)就不确定了，父类的引用指向了子类对象

        // Student能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();

        // Persion 父类型，可以指向子类，但是不能调用子类独有的方法，父类方法被重写，执行子类的重写的方法
        Persion s2 = new Student();
        s2.run();
        s2.cry();

        Object s3 = new Student();

        // 对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
        // 类型转换，父类型转换到子类型,可以执行子类的方法
        ((Student)s2).eat();
        s1.run();
        s1.eat();
        s1.cry();
    }
}
