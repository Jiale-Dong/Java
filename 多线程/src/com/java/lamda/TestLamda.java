package com.java.lamda;

/**
 * @author dong
 * @date 2021/11/14
 * @description  推导lamda表达式
 */

public class TestLamda {

    // 3. 静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lamda() {
            System.out.println("i like lamda2");
        }
    }

    public static void main(String[] args) {
        Ilike like = new Like();
        like.lamda();

        like = new Like2();
        like.lamda();

        // 4. 局部内部类
        class Like3 implements Ilike{
            @Override
            public void lamda() {
                System.out.println("i like lamda3");
            }
        }

        like = new Like3();
        like.lamda();

        // 5. 匿名内部类：没有类的名称，必须借助接口或者父类
        like = new Ilike(){
            @Override
            public void lamda() {
                System.out.println("i like lamda4");
            }
        };
        like.lamda();

        // 6. 用lamda简化
        like = ()->{
            System.out.println("i like lamda4");
        };
    }
}

// 1. 定义一个函数式接口：只有一个抽象方法的接口
interface Ilike{
    void lamda();
}

// 2. 实现类
class Like implements Ilike{
    @Override
    public void lamda() {
        System.out.println("i like lamda");
    }
}

