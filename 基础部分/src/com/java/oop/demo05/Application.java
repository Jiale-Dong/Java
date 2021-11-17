package com.java.oop.demo05;

/*
2021.9.24 继承 extends
1. 继承的本质是对某一批类的抽象，比如人是对老师和学生的抽象，
   则人是父类，老师和学生是子类；
2. extends的意思是扩展，子类对父类的扩展
3. JAVA中只有单继承，没有多继承

- 继承是类与类之间的一种关系。除此之外，类与类之间的关系还有‘依赖、组合、聚合’等
- 继承关系到的俩个类，一个为子类（派生类）一个为父类（基类）。子类继承父类使用关键字
  extends来表示；
- 子类和父类之间从意义上讲应该具有"is a"的关系；

重点：
1. object类
2. super
3. 方法重写

 */


public class Application {
    public static void main(String[] args) {
        Student xiaoming = new Student();
        Teacher teacher = new Teacher();

        xiaoming.say();
        System.out.println("小明继承了" + xiaoming.getMoney());
    }
}

















