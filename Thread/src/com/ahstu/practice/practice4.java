package com.ahstu.practice;
/*
��ȡһ���ַ�������һ���ַ����г��ֵĴ���
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
