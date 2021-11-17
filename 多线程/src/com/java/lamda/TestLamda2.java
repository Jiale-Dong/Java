package com.java.lamda;

/**
 * @author dong
 * @date 2021/11/14
 * @description
 */

public class TestLamda2 {



    public static void main(String[] args) {

//        Ilove ilove = (int a)-> {
//                System.out.println("i love you " + a);
//        };

        // 简化1：去掉参数类型
//        Ilove ilove = a -> {
//            System.out.println("i love you " + a);
//        };

        // 简化2：去掉花括号
        Ilove ilove = null;
        ilove = a -> System.out.println("i love you " + a);

        ilove.love(521);


    }
}

interface Ilove{
    void love(int a);
}
