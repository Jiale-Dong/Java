package com.java.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author dong
 * @date 2021/9/30
 * @description Path对象，位于java.nio.file包，Path对象和File对象类似
 */
public class Test02 {
    public static void main(String[] args) {

        // 构造一个Path对象，相对路径
        Path p1 = Paths.get(".", "project", "study");
        System.out.println(p1);

        Path p2 = p1.toAbsolutePath(); // 转换为绝对路径
        System.out.println(p2);

        Path p3 = p2.normalize();   // 转换为规范路径
        System.out.println(p3);

        File f = p3.toFile(); // 转换为File对象
        System.out.println(f);

        System.out.println("=========遍历Path ===========");
        for (Path p : Paths.get("..").toAbsolutePath()) { // 可以直接遍历Path
            System.out.println("  " + p);
        }
    }
}
