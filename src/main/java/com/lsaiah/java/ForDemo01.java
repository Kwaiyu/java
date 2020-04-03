package com.lsaiah.java;

public class ForDemo01 {
    public static void main(String[] args) {
        //TODO:给定一个数组，请用for循环倒序输出每一个元素
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i = 4; i>=0; i--){
            System.out.println(ns[i]);
        }
    }
}
