package com.lsaiah.java;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
//            throw new IllegalArgumentException();   //丢失原始异常NullPointerException
            throw new IllegalArgumentException(e);
        }
    }
    static void process2() {
        throw new NullPointerException();
    }
}
