package com.ahstu.jk;

/**
 * 解决线程安全
 */
class window implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) { //添加synchronized解决线程安全
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class ThreadSafe {
    public static void main(String[] args) {
        window s=new window();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}
