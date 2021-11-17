package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description StringBulider
 */
public class Demo05 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(2)
                .add(3)
                .inc()
                .inc()
                .inc()
                .add(10);
        System.out.println(adder.value());
    }
}

class Adder{
    public int m = 0;

    /*
    类名修饰的方法为什么可以无限调用呢？
    因为它是return的this，而this的对象又是指的本类
     */
    public Adder add(int i){
        m += i;
        return this;
    }

    public Adder inc(){
        m ++;
        return this;
    }

    public int value() {
        return m;
    }

}
