package com.ahstu.practice;
/*
指定字符串反转，如"abcdef"-->"aedcbf"
 */
public class practice3 {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] a=str.toCharArray();
        int i=1,j=str.length()-1;
        char temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j-1];
            a[j-1]=temp;
            i++;
            j--;
        }
        System.out.println(a);
    }
}