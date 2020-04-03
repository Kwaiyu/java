package com.lsaiah.datatructure;
import org.junit.jupiter.api.Test;

public class InsertValueSearch {

    //递归实现插值查找
    public int recursionBinarySearch(int[] arr,int key,int start,int end) {
        //当查找的值小于数组最小值,或者大于数组最大值,或者start>end时查找结束
        if(key<arr[start]||key>arr[end]||start>end) {
            return -1;
        }
        if(arr[start]==key) {
            return start;
        }
        if(arr[end]==key) {
            return end;
        }
        int mid = start+(end-start)*((key-arr[start])/(arr[end]-arr[start]));
        if(arr[mid]>key) {
            //说明key在前半部分
            return recursionBinarySearch(arr,key,start,mid-1);
        }
        else if(arr[mid]<key) {
            //说明key在后半部分
            return recursionBinarySearch(arr,key,mid+1,end);
        }else {
            return mid;
        }
    }
    //非递归实现插值查找
    public int commonBinarySearch(int[] arr,int key) {
        int start=0;
        int end=arr.length-1;
        if(key<arr[start]||key>arr[end]) {
            return -1;
        }
        int mid = start+(end-start)*((key-arr[start])/(arr[end]-arr[start]));
        while(start<=end) {
            if(arr[mid]==key) {
                return mid;
            }else if(arr[mid]>key) {//说明查找的值在mid的前面
                end=mid-1;
            }else {//说明查找的值在mid的后面
                start=mid+1;
            }
            mid=start+(end-start)*((key-arr[start])/(arr[end]-arr[start]));
        }
        return -1;
    }

    //递归测试
    @Test
    public void testRecursion() {
        int[] arr= {1,2,4,5,6,7,8,9};
        int result=recursionBinarySearch(arr,1,0,arr.length-1);
        if(result==-1) {
            System.out.println("你要查找的数不在该数组中");
        }else {
            System.out.println("你要查找的数在数组的第"+(result+1)+"个位置");
        }

    }
    //非递归测试
    @Test
    public void testCommon() {
        int[] arr= {1,2,4,5,6,7,8,9};
        int result=commonBinarySearch(arr,1);
        if(result==-1) {
            System.out.println("你要查找的数不在该数组中");
        }else {
            System.out.println("你要查找的数在数组的第"+(result+1)+"个位置");
        }
    }
}
