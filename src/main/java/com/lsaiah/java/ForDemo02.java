package com.lsaiah.java;

public class ForDemo02 {
    public static void main(String[] args) {
        //TODO:利用for each循环对数组每个元素求和：
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for(int i : ns){
            sum+=i;
        }
        System.out.println(sum);
    }
}
