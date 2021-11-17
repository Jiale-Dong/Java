package com.java.oop.demo07;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */
public class Application {

    // 静态方法和非静态的方法区别很大
        // A、B静态方法：方法的调用只和左边的定义的数据类型有关  提示：不应该通过类实例访问静态成员

        // 非静态: 重写

    public static void main(String[] args) {
        A a = new A();
        a.test();

        // 父类的引用指向了子类
        B b = new A(); // 子类重写了父类的方法(仅与非静态方法有关)
        b.test();
    }
}
