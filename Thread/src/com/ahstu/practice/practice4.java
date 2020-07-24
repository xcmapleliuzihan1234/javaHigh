package com.ahstu.practice;
/*
获取一个字符串在另一个字符串中出现的次数
 */
public class practice4 {
    public static void main(String[] args) {
        String str1="ab";
        String str2="abkhklabghiuhablkajkjb";
        change(str1,str2);
    }
    public static void change(String str1, String str2){
       int s1= str2.length();
        str2=str2.replace(str1,"");
       int s2=str2.length();
        System.out.println((s1-s2)/str1.length());
    }
}
