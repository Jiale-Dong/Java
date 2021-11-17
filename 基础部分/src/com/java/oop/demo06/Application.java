/*
2021.9.24 super与this


 */

package com.java.oop.demo06;

/**
 * @author dong
 * @date 2021/9/24
 * @description 主类，比较this与super
 */
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.test("dong");
        student.test1();
    }
}
