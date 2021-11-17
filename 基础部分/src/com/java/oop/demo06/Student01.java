package com.java.oop.demo06;

/**
 * @author dong
 * @date 2021/9/24
 * @description 默认调用父类的无参构造
 */
public class Student01 extends Persion01{

    public Student01(){
        // super隐藏代码，调用了父类的无参构造
//        super(); // 显示调用父类的构造器，必须要在子类构造器的第一行
        this("jiale");   // this调用子类的有参构造与super冲突
        System.out.println("Student01无参构造器被执行了");

    }
    public Student01(String name){
        this.name = name;
        System.out.println(this.name);
    }
    private String name = "jia";
}

/*
1. 子类构造器与父类构造器的关系
   - 父类构建无参构造方法，则子类可以构建无参和有参构造器，super()隐式在 this("jiale")之前执行
     子类中super()和this("有参)会有冲突;
   - 父类中没有无参构造方法，则子类无参构造中可以用super("父类有参")使代码不报错;

2. ？？？父类有 有参构造函数，子类的无参和有参构造
 */