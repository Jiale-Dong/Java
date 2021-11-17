package com.java.exception.demo02;

/**
 * @author dong
 * @date 2021/9/26
 * @description 自定义异常
 */

// 自定义的异常类
public class MyException extends Exception{
    // 传递数字 > 10
    private int detail;

    // 有参构造
    public MyException(int a) {
        this.detail = a;
    }

    // toString: 异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
