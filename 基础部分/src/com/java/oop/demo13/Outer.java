package com.java.oop.demo13;

/**
 * @author dong
 * @date 2021/9/26
 * @description 内部类
 */
public class Outer {

    private static int id = 10;

    public void oute(){
        System.out.println("这是一个外部类");
    }

    // 局部内部类
    public void method(){
        class Inner{

        }
    }

    // 静态内部类无法访问非静态属性
    public class Inner{

        public void inn(){
            System.out.println("这是一个内部类");
        }

        // 获得外部类的私有属性和方法
        public void getID(){

            System.out.println(id);
        }

        //获得外部类的方法 (但不是私有)
        public void getOuter(){
            oute();
        }
    }

}
