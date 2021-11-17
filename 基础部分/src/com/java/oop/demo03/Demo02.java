package com.java.oop.demo03;

// 打印最大值
public class Demo02 {
    public static void main(String[] args) {

        printMax(23.3, 7, 4, 2);
        // 传入数组也可以实现，本质就是数组
        printMax(new double[]{1, 2, 3});
    }
    public static void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];
        for (int i=1; i< numbers.length;i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The maxvalue is " + result);


    }
}