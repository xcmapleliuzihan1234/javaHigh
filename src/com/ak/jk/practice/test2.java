package com.ak.jk.practice;

import java.util.*;

/*
请把学生名与考试分数录入到集合中，并按分数显示前三名成绩学员的名字
Student(name,score);
 */
public class test2 {
    public static void main(String[] args) {
        //用到排序，首先考虑TreeMap
        Map students = new TreeMap();
        //存入学生姓名和分数到map中
        students.put("student1",80);
        students.put("student2",68);
        students.put("student3",70);
        students.put("student4",90);
        students.put("student5",75);
        students.put("student6",85);
        //将students.entrySet转换为List
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(students.entrySet());
        //借助Collections工具类实现排序
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //降序排序
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //遍历打印map中的值
        System.out.println("map中的值(排序后)：");
        for (Map.Entry<String,Integer> entry:list) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        //打印成绩前三名的学生的姓名
        System.out.println("成绩前三名的学生为：");
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i).getKey()+" ");
        }
    }
}