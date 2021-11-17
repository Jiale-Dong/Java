package com.java.core;

/**
 * @author dong
 * @date 2021/10/7
 * @description 引用类型的比较,必须使用equals
 */
public class Demo10 {
    public static void main(String[] args) {

        // 1.引用类型的比较
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true

        // 2. parseInt()进制转化
        int i = Integer.parseInt("100", 16); // 256,因为按16进制解析
        System.out.println(i);
        System.out.println(Integer.toString(100)); // "100",表示为10进制
        System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
        System.out.println(Integer.toHexString(100)); // "64",表示为16进制
        System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
        System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制

        // 3. 整数和浮点数的包装类型都继承自Number
        Number num = new Integer(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int i1 = num.intValue();
        long l = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        System.out.println(b);
        System.out.println(i1);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
