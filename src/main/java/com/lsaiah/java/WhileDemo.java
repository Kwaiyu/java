package com.lsaiah.java;

public class WhileDemo {
    public static void main(String[] args) {
        //TODO:使用while计算从m到n的和：
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m<n) {
            m++;
            sum+=m;
        }
        System.out.println(sum);
    }
}
