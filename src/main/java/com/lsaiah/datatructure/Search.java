package com.lsaiah.datatructure;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

/**
 * 顺序查找
 */
public class Search {
    public int search(int[] arr,int num) {
        if(arr.length==0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        int[] arr={4,6,2,8,1,9,0,3};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要查找的数:");
        int num=input.nextInt();
        int result=search(arr,num);
        if(result==-1){
            System.out.println("你输入的数不存在与数组中");
        }
        else {
            System.out.println("你输入的数字存在，在数组中的位置是第："+(result+1)+"个");
        }
    }
}