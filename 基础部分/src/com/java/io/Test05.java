package com.java.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author dong
 * @date 2021/9/30
 * @description InputStream实现类：ByteArrayInputStream可以在内存中模拟一个InputStream
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        byte[] data = {12,45,12,0,8,76,6};
        try(InputStream input = new ByteArrayInputStream(data)){
            int n;
            while ((n = input.read())!= -1){
                System.out.println(n);
            }
        }
    }
}
