package com.java.oop.demo13;

/**
 * @author dong
 * @date 2021/9/26
 * @description
 */
public class Application {
    public static void main(String[] args) {
        // new外部类
        Outer outer = new Outer();
        outer.oute();

        // 实例化 内部类方法 ——> 通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.inn();
        inner.getID();
        inner.getOuter();


    }
}
