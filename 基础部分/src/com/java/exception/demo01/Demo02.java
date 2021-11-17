package com.java.exception.demo01;

/**
 * @author dong
 * @date 2021/9/26
 * @description
 */
public class Demo02 {
    public static void main(String[] args) {

        try {
            new Demo02().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        int a = 1;
        int b = 0;

        // Ctrl + alt + T
        try {
            if(b==0){

                // 主动抛出异常 throw 与throws完全不一样
                throw new ArithmeticException(); // 主动抛出异常， 一般在方法中使用
            }
            System.out.println(a/ b);
        }catch (Error e) {   // catch(想要捕获的参数类型) 捕获异常
            System.out.println("Error");
        }
        catch (Exception e){   // catch(想要捕获的参数类型) 捕获异常
            System.out.println("Exception");
        }
        catch (Throwable e){   // catch(想要捕获的参数类型) 捕获异常
            System.out.println("Throwable");
        }finally { // 处理善后工作
            System.out.println("finally");
        }
    }

    // 假设方法中处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if(b==0){
            // 主动抛出异常 throw 与throws完全不一样
            throw new ArithmeticException(); // 主动抛出异常
        }
        System.out.println(a/ b);
    }
}
