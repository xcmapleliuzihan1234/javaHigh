package com.ahstu.practice;
/*
���ַ������ַ�������Ȼ˳������
��ʾ��1���ַ�������ַ�����
      2������������ѡ��ð�ݡ�Array.sort()
      3�����������������ַ���
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