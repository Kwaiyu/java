package com.lsaiah.java;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //TODO:使用switch实现一个简单的石头、剪子、布游戏。
        System.out.println("输选择：");
        System.out.println("1. 石头");
        System.out.println("2. 剪刀");
        System.out.println("3. 布");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) Math.random() * 3;
        System.out.printf("电脑选择：%d\n", random);
        switch (choice){
            case 1:
                switch (random){
                    case 1:
                        System.out.println("平局");
                        break;
                    case 2:
                        System.out.println("你赢了");
                        break;
                    case 3:
                        System.out.println("你输了");
                        break;
                }
                break;
            case 2:
                switch (random){
                    case 1:
                        System.out.println("你输了");
                        break;
                    case 2:
                        System.out.println("平局");
                        break;
                    case 3:
                        System.out.println("你赢了");
                        break;
                }
                break;
            case 3:
                switch (random){
                    case 1:
                        System.out.println("你赢了");
                        break;
                    case 2:
                        System.out.println("你输了");
                        break;
                    case 3:
                        System.out.println("平局");
                        break;
                }
                break;
            default:
                throw new IllegalArgumentException("输入错误: " + random);
        }
    }
}
