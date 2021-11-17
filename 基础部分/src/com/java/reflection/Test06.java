package com.java.reflection;

/**
 * @author dong
 * @date 2021/9/28
 * @description  类加载器
 */
public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器-->根加载器(c/c++实现)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); // 输出null

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.reflection.Test06").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的 Object  ct.jar包下的核心类
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);  // 输出null

        // 如何获得类加载器可以加载的路径 类只能在以下路径才可以加载
        System.out.println(System.getProperty("java.class.path"));

        /*
        D:\Software\JAVA\jdk\jre\lib\charsets.jar;
        D:\Software\JAVA\jdk\jre\lib\deploy.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\access-bridge-64.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\cldrdata.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\dnsns.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\jaccess.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\jfxrt.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\localedata.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\nashorn.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\sunec.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\sunjce_provider.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\sunmscapi.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\sunpkcs11.jar;
        D:\Software\JAVA\jdk\jre\lib\ext\zipfs.jar;
        D:\Software\JAVA\jdk\jre\lib\javaws.jar;
        D:\Software\JAVA\jdk\jre\lib\jce.jar;
        D:\Software\JAVA\jdk\jre\lib\jfr.jar;
        D:\Software\JAVA\jdk\jre\lib\jfxswt.jar;
        D:\Software\JAVA\jdk\jre\lib\jsse.jar;
        D:\Software\JAVA\jdk\jre\lib\management-agent.jar;
        D:\Software\JAVA\jdk\jre\lib\plugin.jar;
        D:\Software\JAVA\jdk\jre\lib\resources.jar;
        D:\Software\JAVA\jdk\jre\lib\rt.jar;
        E:\Workspace\Java\Project\java\target\classes;
        D:\Software\JAVA\idea\IntelliJ IDEA 2020.2\lib\idea_rt.jar

         */

        // 双亲委派机制
            // java.lang.String --> JDK如果有该类，则自己定义的无法使用
    }
}


