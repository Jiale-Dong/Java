package com.java.oop.demo01;


    /*
    方法分为两种,静态方法static和非静态方法
    1. 静态方法可以直接使用方法
    2. 非静态方法需实例化这个类new
     */
//public class Demo02 {
//    public static void main(String[] args) {
//        Student.say();
//    }

// 使用非静态方法
public class Demo02 {
    public static void main(String[] args) {
        // new 关键字实例化
        // 对象类型 对象名 = 对象值
//        Student student = new Student();
//        student.say();
    }

    /*
    * 定义两个方法
    * 1. 如果两个方法都是静态方法，可以互相调用
    * 2. 如果两个方法都是非静态方法，可以互相调用
    * 3. 如下当a()加载的时候调用b()方法，此时b()并不存在
    * */

    // 静态方法、和类一起加载
    public static void a(){
        //b();
    }

    // 非静态方法, 类实例化后才存在
    public void b(){
        a();
    }

}
