package com.java.exception.demo01;

/**
 * @author dong
 * @date 2021/9/26
 * @description   异常， 以下重复执行会造成栈溢出错误
 */
public class Test {
    public static void main(String[] args) {
//        new Test().a();

    }

        public void a(){
            b();
        }
        public void b(){
            a();
        }

}
