package com.lsaiah.java;

public class DoWhileDemo {
    public static void main(String[] args) {
        //TODO:使用do while循环计算从m到n的和。
        int sum = 0;
        int m = 20;
        int n = 100;
        do {
            m++;
            sum+=m;
        } while (m<n);
        System.out.println(sum);
    }
}
