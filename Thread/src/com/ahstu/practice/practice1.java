package com.ahstu.practice;

/**
 * ������1���˻�
 * �����������ֱ���ͬһ���˻��洢3000Ԫ��ÿ�δ�1000����3�Ρ�ÿ�δ����ӡ�˻����
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
          System.out.println(Thread.currentThread().getName()+"����ǰ�˻���"+maney);
      }
        }
    }
}
public class practice1 {
    public static void main(String[] args) {
        User s=new User();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.setName("�˻�1");
        t2.setName("�˻�2");
        t1.start();
        t2.start();
    }
}
