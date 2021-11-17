package com.java.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author dong
 * @date 2021/9/30
 * @description   File对象
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
        1. java.io提供了File对象来操作文件和目录
        2. 在Win平台中，使用\作为路径分隔符，在Java字符串中需要用\\表示一个\。
           "E:\1.txt"；
        3. Linux平台使用/作为路径分隔符：
           "/usr/bin/javac"
         */
        File file = new File("E:\\Workspace\\Java\\Project\\java\\1.txt");
        File file1 = new File("E:\\Workspace\\Java\\Project\\java");
        File file5 = new File("E:\\Workspace\\Java\\Project\\java\\target\\..\\1.txt");
        File file6 = new File("E:\\Workspace\\Java\\Project\\java");

        System.out.println(file);
        System.out.println(file5);

        System.out.println("=============绝对路径与相对路径=================");
        // 当前路径："E:\Workspace\Java\Project\java"
        File file2 = new File("java学习截图\\集合"); //
        File file3 = new File(".\\java学习截图\\集合"); //"E:\Workspace\Java\Project\java\java学习截图\集合"
        File file4 = new File("...\\IO\\2.txt"); // "E:\Workspace\Java\Project\IO\2.txt"

        System.out.println("=============File对象有3种形式表示的路径=================");
        // 返回构造方法传入的路径
        System.out.println(file.getPath());
        // 返回绝对路径
        System.out.println(file.getAbsolutePath());
        // 它和绝对路径类似，但是返回的是规范路径
        // 绝对路径：C:\Windows\System32\..\notepad.exe == 规范路径C:\Windows\System32\notepad.exe
        System.out.println(file.getCanonicalPath());

        // 打印当前平台的分隔符
        System.out.println(File.separator);

        System.out.println("==========判断当前路径和文件是否存在=============");
        // boolean canRead()：是否可读；
        // boolean canWrite()：是否可写；
        // boolean canExecute()：是否可执行；
        // long length()：文件字节大小。
        System.out.println("当前文件是否存在：" + file.isFile());
        System.out.println("当前路径是否存在：" + file1.isDirectory());
        System.out.println("当前文件大小：" + file1.length());
        System.out.println("当前文件是否可执行：" + file1.canExecute());

        System.out.println("==========创建和删除文件=============");
        File file7 = new File("E:\\new");
        if (file7.createNewFile()){
            System.out.println("new文件创建成功");
            if(file7.delete()){
                System.out.println("文件已删除");
            }
        }

        System.out.println("=========创建临时文件===========");
        File f = File.createTempFile("tmp-", ".txt"); // 提供临时文件的前缀和后缀
        f.deleteOnExit(); // JVM退出时自动删除
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());

        System.out.println("=========遍历目录===========");
        // 列出所有文件和子目录
        File[] files = file1.listFiles();
        printFiles(files);

        // 仅列出.exe文件
        File[] files2 = file1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                return name.endsWith(".exe");
                // 返回以“**”开始的文件
                return name.startsWith("java");
            }
        });
        printFiles(files2);
    }

    private static void printFiles(File[] files) {
        System.out.println("========文件遍历开始============");
        if (files != null){
            for (File file : files) {
                System.out.println(file);
            }
        }
        System.out.println("========文件遍历结束===========");
    }
}
