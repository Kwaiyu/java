package com.lsaiah.java;

public class MethodDemo01 {
    public static void main(String[] args) {
        Person01 p = new Person01();
        p.setAge(10);
        p.setName("张三");
        System.out.println("姓名：" + p.getName() + " 年龄：" + p.getAge());
    }
}

class Person01 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
}
