package com.java.oop.demo05;

// Persion 人   父类
public class Persion {


    // public  四个优先级
    // protected
    // default
    // private
    // money修饰符如果改为私有，则子类不能继承该属性
    private int money = 1000000000;
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
