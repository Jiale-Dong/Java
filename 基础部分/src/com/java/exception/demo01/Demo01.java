package com.java.exception.demo01;

/**
 * @author dong
 * @date 2021/9/26
 * @description   异常
 */
public class Demo01 {
    public static void main(String[] args) {

        int a = 1;
        int b= 0;

        try{ // 监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){   // catch 捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally { // 处理善后工作
            System.out.println("finally");
        }


        // finally 可以不要finally  IO、资源、关闭


        // 假设要捕获多个异常，要从小到大检测
        try{ // 监控区域
           new Demo01().a();
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
    public void a(){
        b();
    }
    public void b(){
        a();
    }




}
