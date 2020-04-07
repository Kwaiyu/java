package com.lsaiah.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法suffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        //List转Array:
        Integer[] nums = list.toArray(Integer[]::new);
        //数组排序
        Arrays.sort(nums);
        //判断20是否在末位,数组索引从0开始
        if(nums[nums.length-1] != end){
            return end;
        }
        //判断10是否在首位
        else if(nums[0] != start){
            return start;
        }
        //此时缺失的数字一定在(10,20)中
        for (int i=1; i<nums.length;i++){
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        //未缺失任何数字
        return 0;
    }
}
