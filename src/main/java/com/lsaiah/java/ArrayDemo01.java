package com.lsaiah.java;

import java.util.Arrays;

public class ArrayDemo01 {
    private static int[][] ns = {
            { 1, 2, 3, 4 },
            { 5, 6 },
            { 7, 8, 9 }
    };
    public static void forMethod(){
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
            System.out.println();
        }
    }
    public static void foreachMethod(){
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        forMethod();
        foreachMethod();
        System.out.println(Arrays.deepToString(ns)); //Standard library method
    }
}
