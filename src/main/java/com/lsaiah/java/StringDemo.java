package com.lsaiah.java;

public class StringDemo {
    public static void main(String[] args) {
        //TODO: 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        String s = " "+(char)a + (char) b + (char) c;
        System.out.println(s);
    }
}
