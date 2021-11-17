package com.java.demo02;

/**
 * @author dong
 * @date 2021/11/13
 * @description   静态代理，帮助实现
 */

// 代理角色，帮助你结婚
public class WeddingConpany implements Marry{

    private Marry target;

    public WeddingConpany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();  // 这就是真实对象
        after();
    }

    private void before(){
        System.out.println("交定金，布置会场");
    }

    private void after(){
        System.out.println("付尾款");
    }

}


