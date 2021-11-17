package com.java.oop.demo06;

// 学生（类） is 人(类)， 派生类、子类；
// 子类继承父类、就会拥有父类的全部方法

/**
 * @author
 */
public class Student extends Persion {

    public Student(){

        System.out.println("Student无参构造器被执行了");
    }

    private String name = "jia";

    //重写
    @Override
    public void print(){
        System.out.println("Student");
    }

    public void test(String name){
        // 输出传过来的参数 dong
        System.out.println(name);
        // 输出当前类定义的参数 jia
        System.out.println(this.name);
        // 输出父类定义的参数 le
        System.out.println(super.name);
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }


}
