package com.ak.jk.practice;

import java.util.*;

/*
���ѧ�����뿼�Է���¼�뵽�����У�����������ʾǰ�����ɼ�ѧԱ������
Student(name,score);
 */
public class test2 {
    public static void main(String[] args) {
        //�õ��������ȿ���TreeMap
        Map students = new TreeMap();
        //����ѧ�������ͷ�����map��
        students.put("student1",80);
        students.put("student2",68);
        students.put("student3",70);
        students.put("student4",90);
        students.put("student5",75);
        students.put("student6",85);
        //��students.entrySetת��ΪList
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(students.entrySet());
        //����Collections������ʵ������
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //��������
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //������ӡmap�е�ֵ
        System.out.println("map�е�ֵ(�����)��");
        for (Map.Entry<String,Integer> entry:list) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        //��ӡ�ɼ�ǰ������ѧ��������
        System.out.println("�ɼ�ǰ������ѧ��Ϊ��");
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i).getKey()+" ");
        }
    }
}