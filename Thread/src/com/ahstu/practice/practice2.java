package com.ahstu.practice;
/*
ģ��trim()ɾ���ַ������˵Ŀո�
 */
public class practice2 {
    public static void main(String[] args) {
        String str=" abcde ";
        char[] a=str.toCharArray();
       char[] b=new char[6];
        System.out.println(str.length());
       for(int i=1;i<str.length()-1;i++){
            b[i]= a[i];
           System.out.print(b[i]);
       }
    }
}
