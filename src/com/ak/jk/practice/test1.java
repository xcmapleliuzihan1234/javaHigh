package com.ak.jk.practice;
/*
请从键盘随机输入十个整数保存到List中，
并按照倒序、从大到小的顺序显示出来
 */
import java.util.*;

public class test1 {
    public static void main(String[] args) {
   ArrayList list= new ArrayList();
    Scanner i = new Scanner(System.in);
    for (int j=0;j<10;j++){
        int id = i.nextInt();
        list.add(id);
    }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);


 }
}