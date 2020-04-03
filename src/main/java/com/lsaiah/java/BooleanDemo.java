package com.lsaiah.java;

public class BooleanDemo {
    public static void main(String[] args) {
        //TODO:判断指定年龄是否是小学生（6～12岁）
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age>6 && age<12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
