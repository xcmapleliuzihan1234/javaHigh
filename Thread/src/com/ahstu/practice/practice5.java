package com.ahstu.practice;
/*
��ȡ�����ַ����������ͬ�Ӵ�
��ʾ�����̵��Ǹ����������εݼ����Ӵ���ϳ��Ĵ��Ƚ�
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