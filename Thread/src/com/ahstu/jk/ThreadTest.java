package com.ahstu.jk;

/**
 * 遍历100以内的偶数
 */
//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类的run();
    public void run(){
        for (int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread s = new MyThread();
        //通过此对象调用start()
        s.start();
    }
}
