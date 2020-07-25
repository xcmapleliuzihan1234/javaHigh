package com.ahstu.practice;
/*
获取两个字符串中最大相同子串
提示：将短的那个串进行依次递减的子串与较长的串比较
 */
public class practice5 {
    public static void main(String[] args) {
        String str1 = "shjkkjhabcdkukihfk";
        String str2 = "soabcdiljh";
        System.out.println(compare(str1, str2));
    }

    public static String compare(String str1, String str2) {

        for(int i=0; i<str2.length(); i++)
        {
            for(int y=0,z=str2.length()-i; z!=str2.length()+1; y++,z++)
            {
                String temp = str2.substring(y,z);
                if (str1.contains(temp)) {
                   return temp;

                }
            }
        }return "";
    }
}