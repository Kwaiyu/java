package com.lsaiah.java;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")){
            System.out.println("测试通过");
        }else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        //创建一个空栈，通过Deque实现
        Deque<Character> dq = new LinkedList<>();
        //循环计算12500%16=0压入栈
        for (int i=n; i !=0; i= i/16){
            int remainder = i%16;
            int ch;
            if (remainder >= 10){
                ch = 65 + (remainder-10);
            }else {
                ch = remainder + 48;
            }
            dq.push(Character.valueOf((char) ch));
        }
        StringBuilder result = new StringBuilder(dq.size());
        while (dq.peek() != null){
            result.append(dq.pop());
        }
        return result.toString();
    }
}
