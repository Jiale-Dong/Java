package com.java.oop.demo08;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */
public class Student extends Persion{
    @Override
    public void run() {
//        super.run();
        // 重写父类的方法
        System.out.println("run");
    }

    public void eat(){
        System.out.println("eat");
    }
}
