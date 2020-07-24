package com.ahstu.practice;
/*
Ä£Äâtrim()É¾³ý×Ö·û´®Á½¶ËµÄ¿Õ¸ñ
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
