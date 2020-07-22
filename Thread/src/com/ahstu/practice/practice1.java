package com.ahstu.practice;

/**
 * 银行有1个账户
 * 有两个储户分别向同一个账户存储3000元，每次存1000，存3次。每次存完打印账户余额
 */
class User implements Runnable{
private int maney=0;
Object obj=new Object();
    @Override
    public void run() {
        for (int i=0;i<3;i++){
        synchronized (obj){
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
         maney+=1000;
          System.out.println(Thread.currentThread().getName()+"：当前账户余额："+maney);
      }
        }
    }
}
public class practice1 {
    public static void main(String[] args) {
        User s=new User();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.setName("账户1");
        t2.setName("账户2");
        t1.start();
        t2.start();
    }
}
