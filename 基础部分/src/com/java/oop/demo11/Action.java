package com.java.oop.demo11;

/**
 * @author dong
 * @date 2021/9/25
 * @description  抽象类: 类   单继承--->  （接口 多继承）
 */

// abstract 抽象类
public abstract class Action {


    // 约束~ 有人帮我们实现
    // abstract 抽象方法， 只有方法名字，没有方法的实现
    public abstract void doSomething();

    public void doSomething01() {

    };

}

/*
1. 不能new出来，只能靠子类去实现他
2. 抽象类中可以写普通方法
3. 抽象方法必须在抽象类中
// 抽象的抽象: 约束~

// 思考题？  抽象类中无法实例化、无法new  存在构造器么？
           抽象类存在的意义   抽象出来~   提高开发效率

 */
