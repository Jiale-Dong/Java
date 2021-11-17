package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author dong
 * @date 2021/9/30
 * @description 输入流
 */
public class Test03 {
    public static void main(String[] args) throws IOException {

        // 创建一个FileInputStream对象,:
        InputStream input = new FileInputStream(".\\io\\1.txt");
        for (;;) {
            /*

             */
            int n = input.read(); // 反复调用read()方法，直到返回-1
            // 返回-1，表示没有数据了
            if (n == -1) {
                break;
            }
            System.out.println(n); // 打印byte的值
        }
        /*
        在计算机中，类似文件、网络端口这些资源，都是由操作系统统一管理的。
        应用程序在运行的过程中，如果打开了一个文件进行读写，完成后要及时地关闭，
        以便让操作系统把资源释放掉，否则，应用程序占用的资源会越来越多，不但白白
        占用内存，还会影响其他应用程序的运行。
         */
        input.close(); // 关闭流

        System.out.println("==========自动关闭io流=============");
        /*
        Java 7引入的新的try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源。
        - 实际上，编译器并不会特别地为InputStream加上自动关闭。编译器只看try(resource = ...)
        中的对象是否实现了java.lang.AutoCloseable接口，如果实现了，就自动加上finally语句并
        调用close()方法。InputStream和OutputStream都实现了这个接口，因此，都可以用在try(resource)中。
         */
        try(FileInputStream fileInput = new FileInputStream(".\\io\\1.txt")){
            int n;
            while((n=fileInput.read())!= -1){
                System.out.println(n);
            }
        }
    }
}
