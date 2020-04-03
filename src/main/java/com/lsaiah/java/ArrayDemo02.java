package com.lsaiah.java;

public class ArrayDemo02 {
    public static void main(String[] args) {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        //外循环控制一维数组
        for(int i=1;i<scores.length;i++){
            double sum = 0;//定义一个初始化sum
            //内循环控制元素里面的数组
            for(var j=0;j<scores[i].length;j++){
                sum+=scores[i][j];//每个元素里面的数组相加
            }
            double avg = sum /scores[i].length;//求每个元素的平均数
            System.out.println("第"+ i +"班的平均成绩是："+avg);//输出每个元素的平均数
        }
    }
}