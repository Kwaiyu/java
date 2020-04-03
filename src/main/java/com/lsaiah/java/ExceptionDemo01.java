package com.lsaiah.java;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
