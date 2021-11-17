package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author dong
 * @date 2021/9/30
 * @description 缓冲
 */
public class Test04 {
    public static void main(String[] args) throws IOException {

        try(InputStream input =  new FileInputStream(".\\io\\1.txt")) {
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println(n);
            }
        }
    }
}
