package com.java.io;

import java.io.*;

/**
 * @author dong
 * @date 2021/9/30
 * @description 输出流
 */
public class Test06 {

    public Test06() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        Test06 test06 = new Test06();
//        test06.writeFile();
//        test06.writeFile2();
        test06.writeFile3();
    }

    public void writeFile() throws IOException {
        OutputStream output = new FileOutputStream(".\\io\\1.txt");
        output.write(72); // H
        output.write(101); // e
        output.write(108); // l
        output.write(108); // l
        output.write(111); // o
        output.close();
    }

    // 一次性写入
    public void writeFile2() throws IOException {
        OutputStream output2 = new FileOutputStream(".\\io\\1.txt");
        output2.write("Hello".getBytes("UTF-8"));
        output2.close();
    }


    public void writeFile3() throws IOException {
        try (OutputStream output3 = new FileOutputStream(".\\io\\1.txt")) {
            output3.write("Hello3".getBytes("UTF-8")); // Hello
        } // 编译器在此自动为我们写入finally并调用close()
    }
}
