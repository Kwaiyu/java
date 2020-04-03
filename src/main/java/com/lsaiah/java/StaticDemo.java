package com.lsaiah.java;

//TODO:给Person04类增加一个静态字段count和静态方法getCount，统计实例创建的个数
public class StaticDemo {
    public static void main(String[] args) {
        Person04 p4 = new Person04("张三");
        System.out.println(Person04.getCount());
        System.out.println(Person04.getCount());
        Person04 p5 = new Person04("李四");
        System.out.println(Person04.getCount());
        Person04 p6 = new Person04("王五");
        System.out.println(Person04.getCount());
    }
}

class Person04 {
    public Person04(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    static int count;
    static String name;
}