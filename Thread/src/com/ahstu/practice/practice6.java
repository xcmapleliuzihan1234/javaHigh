package com.ahstu.practice;
/*
对字符串中字符进行自然顺序排列
提示：1、字符串变成字符数组
      2、对数组排序，选择，冒泡。Array.sort()
      3、将排序后的数组变成字符串
 */
public class practice6 {
    public static void main(String[] args) {
        String str = "fgsinjkodl";
        sort(str);
    }

    public static void sort(String a) {
        char[] s = a.toCharArray();
        char temp;
        for (int j = 0; j < a.length(); j++) {
            for (int i = 0; i < a.length() - 1 - j; i++) {
                if (s[i] > s[i + 1]) {
                    temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;

                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int t=0;t<s.length-1;t++) {
            str.append(s);
        }
        System.out.println(s);
    }
}