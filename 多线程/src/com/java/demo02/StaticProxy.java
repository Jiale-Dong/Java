package com.java.demo02;

/**
 * @author dong
 * @date 2021/11/13
 * @description 静态代理
 */

public class StaticProxy {
    public static void main(String[] args) {

        // 对比Thread的实现
        // Thread实现了runnable接口
        // WeddingConpany实现了Marry接口

        new Thread(()-> System.out.println("我爱你")).start();
        // System.out.println("我爱你");
        new WeddingConpany(new Persional()).HappyMarry();


    }
}
