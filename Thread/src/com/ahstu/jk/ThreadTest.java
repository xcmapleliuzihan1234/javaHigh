package com.ahstu.jk;

/**
 * ����100���ڵ�ż��
 */
//1.����һ���̳���Thread�������
class MyThread extends Thread{
    //2.��дThread���run();
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
        //����Thread����������
        MyThread s = new MyThread();
        //ͨ���˶������start()
        s.start();
    }
}
