package com.lsaiah.java;

import java.util.Scanner;

public class InputAndOutputDemo {
    public static void main(String[] args) {
        //TODO:请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位
        System.out.println("输入上次成绩：");
        Scanner sc = new Scanner(System.in);
        int lastScore = sc.nextInt();
        System.out.println("请输入本次成绩：");
        int thisScore = sc.nextInt();
        double impore = ((double) thisScore - lastScore) / lastScore * 100;
        System.out.printf("成绩提升了： %.2f%%", impore);
    }
}
