package com.lsaiah.datatructure;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class FibonacciSearch {
    private static int maxsize=20;
    //生成斐波那契数列
    public int[] fibonaqie() {
        int[] f=new int[maxsize];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<maxsize;i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }

    //查找
    public int search(int[] arr,int key) {
        int low=0;
        int high=arr.length-1;
        int k=0;//斐波那契分割数值下标
        int mid=0;
        int f[]=fibonaqie();
        //获得斐波那契分割数值下标
        while(high>f[k]-1) { //int [] a= {1,3,5,7,9,11,12};  6
            k++;
        }
        //利用Java工具类Arrays 构造新数组并指向 数组 arr[]
        int[] temp= Arrays.copyOf(arr, f[k]);
        //对新构造的数组进行 元素补充
        for(int i=high+1;i<temp.length;i++) {
            temp[i]=arr[high];
        }
        while(low<=high) {
            //由于前面部分有f[k-1]个元素
            mid=low+f[k-1]-1;
            if(key<temp[mid]) {
                high=mid-1;
                /**
                 *
                 *全部元素=前部元素+后部元素
                 * f[k]=f[k-1]+f[k-2]
                 * 因为前部有f[k-1]个元素,所以可以继续拆分f[k-1]=f[k-2]+f[k-3]
                 * 即在f[k-1]的前部继续查找 所以k--
                 * 即下次循环 mid=f[k-1-1]-1
                 * */
                k--;
            }else if(key>temp[mid]) {//关键字大于切个位置元素 则查找后半部分
                low=mid+1;
                /***
                 * 全部元素=前部元素+后部元素
                 * f[k]=f[k-1]+f[k-2]
                 * 因为后部有f[k-2]个元素,所以可以继续拆分f[k-2]=f[k-3]+f[k-4]
                 * 即在f[k-2]的前部继续查找 所以k-=2
                 * 即下次循环 mid=f[k-1-2]-1
                 */
                k-=2;
            }else {
                if(mid<=high) {
                    return mid;
                }else {
                    return high;
                }
            }
        }
        return -1;
    }
    @Test
    public void test() {
        int [] a= {1,3,5,7,9,11,12};
        int i=search(a, 5);
        System.out.println("5在："+(i+1));
        int j=search(a, 12);
        System.out.println("12在："+(j+1));
    }
}
