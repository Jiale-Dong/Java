package com.java.core;
import java.lang.String;

/**
 * @author dong
 * @date 2021/9/30
 * @description String
 */
public class Demo01 {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);

        // 字符串由char数组实现
        System.out.println("============================");
        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println("s2：" + s2);

        System.out.println("========变为大写===========");

        String s3 = s2.toUpperCase();
        System.out.println(s3);

        System.out.println("========字符串的比较===========");

        /*
        编译期，会自动把所有相同的字符串当作一个对象放入常量池
        但是s1与s2定义的就不同。

        结论：两个字符串比较，必须总是使用equals()方法
         */
        String s4 = "hello";
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        String s5 = "hello";
        String s6 = "HELLO".toLowerCase();
        System.out.println(s5 == s6); // false
        System.out.println(s5.equals(s6)); // true

        System.out.println("Hello".contains("ll")); //true
        System.out.println("Hello".indexOf("l"));  // 2
        System.out.println("Hello".lastIndexOf("l"));  // 3
        System.out.println("Hello".startsWith("He"));  // true
        System.out.println("Hello".endsWith("lo"));   // true

        // 提取子字符串
        System.out.println("Hello".substring(2)); // 第二个索引到最后
        System.out.println("Hello".substring(2, 4));  // 提取第 2,3,4

        // trim()去除收尾空字符串
        System.out.println("  \tHello\r\n ".trim());

        // strip()方法在JDK11才能使用
        // System.out.println("\u3000Hello\u3000".strip());

        // 字符串判空
        /*
            "".isEmpty(); // true，因为字符串长度为0
            "  ".isEmpty(); // false，因为字符串长度不为0
            "  \n".isBlank(); // true，因为只包含空白字符
            " Hello ".isBlank(); // false，因为包含非空白字符
         */

        // 替换子串，根据字符、字符串或正则表达式替换
        String s7 = "asdadsh";
        s7 =  s7.replace('h','s'); // ''单引号
        s7 = s7.replace("ss","aa");   // 双引号
        System.out.println(s7);

        // 正则匹配
        String s = "A,,B;C ,D";
        s = s.replaceAll("[\\,\\;\\s]+", ",");
        System.out.println(s);

        // 分割字符串
        s = "A,B,C,D";
        String[] ss = s.split("\\,"); //  {"A", "B", "C", "D"}
        for (String s8 : ss) {
            System.out.println(s8);
        }

        // 拼接字符串
        /*
            %s：显示字符串；
            %d：显示整数；
            %x：显示十六进制整数；
            %f：显示浮点数。
         */
        String[] arr = {"A", "B", "C"};
        String sss = String.join("***", arr);
        System.out.println(sss);

        String s8 = "Hi %s, your score is %d!";
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        // 类型转换
        System.out.println(String.valueOf(123)); // "123"

        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("ff", 16); // 按16进制转换
        System.out.println(n2);

        // getInteger(String)方法,不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer
        System.out.println(Integer.getInteger("java.version"));

        char[] cs = "Hello".toCharArray(); // String -> char[]
        String s9 = new String(cs); // char[] -> String
        System.out.println(cs);
        System.out.println(s9);

        // 修改了char[]数组，String并不会改变
        char[] cs1 = "Heo".toCharArray();
        /*
        new String(char[])创建新的String实例时，它并不会
        直接引用传入的char[]数组，而是会复制一份，所以，修改外部
        的char[]数组不会影响String实例内部的char[]数组，因为这是两个不同的数组
         */
        String s10 = new String(cs1);
        System.out.println(s10);
        System.out.println(cs1.equals(s10)); //  这两个数组并不相同
        cs[0] = 'X';
        System.out.println(s10);
    }
}
