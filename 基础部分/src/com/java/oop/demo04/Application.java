/*
* 2021.9.24  封装
* - 该漏的漏，该藏的藏
*   程序设计追求“高内聚，低耦合”。高内聚就是类的内部数据操作细节自己完成
*   ，不允许外部干涉，低耦合：仅暴露少量的方法给外部
* - 属性私有（get、set），封装属性、数据；
*
* 特点:
* 1. 提高程序的安全性，保护数据
* 2. 隐藏代码的细节
* 3. 统一接口
* 4. 系统可维护行增加
*
* 方法重载 - 比如println可以输出各种东西
* 定义：类里边很多方法名相同，但是参数不同
* 理解：方法名, 参数列表相同则是同一个方法；参数列表不同则是重载
*
* */

package com.java.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student xiaoming = new Student();
        Student hong = new Student();

        xiaoming.setName("小明");
        System.out.println(xiaoming.getName());

        // name属性改为public，则xiaoming.name不报错
        String nam =  xiaoming.name;
        System.out.println(nam);

        xiaoming.setAge(9);
        System.out.println(xiaoming.getAge());

        hong.setSex('女');

        // 方法名, 参数列表相同则是同一个方法；参数列表不同则是重载
        System.out.println(hong.getSex());
    }
}

