package com.lsaiah.java;

public class MethodDemo02 {
    public static void main(String[] args) {
    //TODO:请给Person02类增加(String, int)的构造方法：
        Person02 p = new Person02("张三", 10);
        System.out.println("姓名：" + p.getName() + " 年龄：" + p.getAge());
    }
}

class Person02 {
    public Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;
}