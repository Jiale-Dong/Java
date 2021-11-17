package com.java.syn;

/**
 * @author dong
 * @date 2021/11/15
 * @description 不安全的取钱
 */

/*
同步块： synchronized(Obj){}
 */

public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(1000, "结婚基金");
        Drawing you = new Drawing(account, 50, "你");
        Drawing girl = new Drawing(account, 100, "女朋友");

        you.start();
        girl.start();
    }
}

class Account{
    int money; // 余额
    String name;  // 卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread{
    Account account; // 账户
    int getMoney;
    // 现在手里的钱
    int nowMoney;

    public Drawing(Account account, int getMoney, String name){
        super(name);
        this.account = account;
        this.getMoney = getMoney;
    }

    // 取钱
    @Override
    public void run() {
        // 锁的对象就是变化的量，增删改查
        synchronized (account){
            // 判断有没有钱
            if(account.money-getMoney<0){
                System.out.println(Thread.currentThread().getName() + "卡里余额不足");
                return;
            }
            // sleep可以放大问题的发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money = account.money - getMoney;
            nowMoney = nowMoney + getMoney;
            System.out.println(account.name +"余额为： "+ account.money);
            System.out.println(this.getName()+"手里的钱： "+nowMoney);
        }
    }
}
