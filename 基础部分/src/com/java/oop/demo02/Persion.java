package com.java.oop.demo02;

// java ---> class字节码文件
public class Persion {
    // 一个类即使什么也不写，他也会存在一个方法
    // 自己定义的构造器

    String name;


    // 无参构造,
    // 1. 使用new关键字, 本质是在调用构造器
    // 2. 用来初始值值
    public Persion(){
        this.name = "qinjiang";

    }

    // 构造方法.txt: 一旦定义了有参构造, 无参就必须显示定义, 主要是在新建对象时不出错
    public Persion(String name){
        this.name = name;
    }

    // alt + insert 快捷键创建构造器
}

/*
* 构造器(构造方法.txt)
*   1. 和类名相同
*   2. 没有返回值
*
* 作用：
*   1. new本质是在调用构造方法
*   2. 初始化对象的值
*
* 注意点：
*   1. 定义有参构造之后，如果想使用无参构造，显示的定义一个无参构造
*
* alt + insert
* this.(当前类的值) = 当前传进来的值
* */
