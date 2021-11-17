package com.java.exception.demo02;

/**
 * @author dong
 * @date 2021/9/26
 * @description
 */
public class Test {

    static void test(int a) throws MyException{
        System.out.println("传递的参数为：" + a);

        if(a > 10){
            throw new MyException(a);  // 抛出
        }
        System.out.println("OK");
    }
    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
//            e.printStackTrace();
            System.out.println("Myexception===>" + e);;
        }
    }
}
