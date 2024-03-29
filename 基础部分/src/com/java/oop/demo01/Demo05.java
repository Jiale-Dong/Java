package com.java.oop.demo01;

// 引用传递: 对象, 本质还是值传递
// 对象、内存!
public class Demo05 {
    public static void main(String[] args) {
        Persion persion = new Persion();
        System.out.println(persion.name); // null
        Demo05.change(persion);
        System.out.println(persion.name); // 董家乐
    }

    // 与Demo04 int值传递有区别
    // persion是一个对象: 指向----> Persion persion = new Persion(); 这是一个具体的人, 可以改变属性
    public static void change(Persion persion){
        persion.name = "董家乐";

    }
}


// 定义了一个persion类, 有一个属性: name
class Persion{
    String name;
}
