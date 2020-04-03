package com.lsaiah.datatructure;
import org.junit.jupiter.api.Test;

public class BinarySearch {
    //1.循环实现二分查找
    public int rank(int[] arr,int num) {
        int start=0;
        int end=arr.length;
        int mid=(start+end)/2;//中间数的下标
        while(start<=end) {//退出循环的条件 若一直没找到这个数，则会退出循环
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]>num) {
                end=mid-1;
            }else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

    //2.递归实现二分查找
    public int recursion(int[] arr,int num,int start,int end) {
        int mid=(start+end)/2;
        if(start==end&&arr[mid]!=num) {
            return -1;
        }
        if(arr[mid]==num) {
            return mid;
        }else {
            if(arr[mid]>num) {
                end=mid-1;
                return recursion(arr,num,start,end);
            }else{
                start=mid+1;
                return recursion(arr,num,start,end);
            }
        }
    }

    @Test
    public void testRank() {
        int[] arr= {2,3,6,9,13,18,20,22,24,29,30,45,67,88};
        int result=rank(arr,20);
        if(result==-1) {
            System.out.println("你要查找的数字不在该数组中");
        }else {
            System.out.println("你查找的数字在数组的第"+(result+1)+"位");
        }
    }

    @Test
    public void testRecursion() {
        int[] arr= {2,3,6,9,13,18,20,22,24,29,30,45,67,88};
        int result=recursion(arr,22,0,arr.length-1);
        if(result==-1) {
            System.out.println("你要查找的数字不在该数组中");
        }else {
            System.out.println("你查找的数字在数组的第"+(result+1)+"位");
        }
    }
}