package com.java.oop.demo09;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */
public class Student extends Persion{







    public void go(){
        System.out.println("go");
    }
}



















/*
        // Object > String同级
        // Object > Persion > Teacher
        // Object > Persion > Student

        // X与Y编译能不能通过，关键看new后X与Y的关系
//        System.out.println(X instanceof Y.sout);

        Object object = new Student();

        System.out.println(object instanceof Student);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Persion); // False
        System.out.println(object instanceof String); // False

        System.out.println("========================================");

        Persion persion = new Student();
        System.out.println(persion instanceof Student);
        System.out.println(persion instanceof Teacher); // False
        System.out.println(persion instanceof Object);
        System.out.println(persion instanceof Persion);
//        System.out.println(persion instanceof String); // 编译报错

        System.out.println("========================================");

        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Object);
        System.out.println(student instanceof Persion);
//        System.out.println(student instanceof Teacher); // 编译报错
//        System.out.println(student instanceof String); // 编译报错

 */
