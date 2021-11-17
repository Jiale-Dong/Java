package com.java.oop.demo09;

/**
 * @author dong
 * @date 2021/9/25
 * @description
 */
public class Application {
    public static void main(String[] args) {
        // 类型之间的转换:   父 子       (基本类型转换  高转低强转，低转高不用)

        // 高                  低
        // 子类转换为父类，可能会丢失一些方法，比如student转换为Persion类型，丢失了go()方法
        Persion obj = new Student();
        obj.run();

        // 将obj对象转换为Student类型，我们就可以使用Student类型的方法了
        Student student = ((Student) obj);
        student.go();
        student.run();

        ((Student)obj).go();

        // 子类转换为父类，可能会丢失一些方法，比如student转换为Persion类型，丢失了go()方法
        ((Persion)student).run();

        Persion persion = student;
        persion.run();

    }
}

/*
1. 父类引用指向子类的对象  低转高
2. 子类转换为父类，向上转型
3. 父类转换为子类，向下转型，强制转换
4. 方便方法调用，减少重复的代码！简洁


抽象： 封装、继承、多态！     抽象类（单继承）、接口（多继承）

 */














