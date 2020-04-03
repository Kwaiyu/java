package com.lsaiah.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //TODO:请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
        // BMI = 体重(kg)除以身高(m)的平方
        //过轻：低于18.5
        //正常：18.5-25
        //过重：25-28
        //肥胖：28-32
        //非常肥胖：高于32
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重(kg)：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高(m)：");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        if (BMI < 18.5){
            System.out.println("过轻");
        }else if (BMI < 25){
            System.out.println("正常");
        }else if (BMI <28){
            System.out.println("过重");
        }else if (BMI <32){
            System.out.println("肥胖");
        }
        System.out.println("非常肥胖");
    }
}
