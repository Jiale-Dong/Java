package com.java.oop.demo01;

//// 值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a); // a = 1
        Demo04.change(a);
        System.out.println(a); // a = 1
    }

    // a = 1传过来, 只传到形参, 无返回值
    public static void change(int a) {
        a = 10;
    }
}

// 值传递
//public class Demo04 {
//    public static void main(String[] args) {
//        int sum;
//        sum = Demo04.change(2);
//        System.out.println(sum);
//    }
//
//    // a = 1传过来, 只传到形参, 无返回值
//    public static int change(int a) {
//        System.out.println(a);
//        a = 10;
//        System.out.println(a);
//        return a;
//    }
//}
