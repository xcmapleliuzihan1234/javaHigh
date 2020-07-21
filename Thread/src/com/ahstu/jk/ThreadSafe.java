package com.ahstu.jk;

/**
 * ����̰߳�ȫ
 */
class window implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) { //���synchronized����̰߳�ȫ
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "����Ʊ��Ʊ��Ϊ��" + ticket);
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
        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");
        t1.start();
        t2.start();
        t3.start();
    }

}
