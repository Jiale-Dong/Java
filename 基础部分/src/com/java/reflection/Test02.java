package com.java.reflection;

/**
 * @author dong
 * @date 2021/9/27
 * @description 测试Class类的创建方式有哪些
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 子类转父类，会丢失自己的方法
        Persion persion = new Student();
        System.out.println("这个人是：" + persion.name);
        
        // 方式一：通过对象获得
        Class c1 = persion.getClass();
        System.out.println(c1.hashCode());

        // 方式二: forname获得
        Class c2 = Class.forName("com.reflection.Student");
        System.out.println(c2.hashCode());

        // 方式三： 通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四：基本内置的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        System.out.println(c4.hashCode());

        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());

    }
}

class Persion{
    String name;

    public Persion() {
    }

    public Persion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Persion{
    public Student() {
        this.name = "学生";
    }
    public void test(){
        System.out.println("子类独有的方法");
    }
}

class Teacher extends Persion{
    public Teacher() {
        this.name = "教师";
    }
}

