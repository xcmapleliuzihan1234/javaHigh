package com.ak.jk.practice;

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
      //  System.out.println(id);

 }
}