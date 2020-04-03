package com.lsaiah.java;

public class MethodDemo03 {
    public static void main(String[] args) {
    // TODO: 给Person增加重载方法setName(String, String):
        Person03 ming = new Person03();
        Person03 hong = new Person03();
        ming.setName("Xiao Ming");
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person03 {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name, String name1) {
        this.name = name;
        this.name = name1;
    }
    private String name;
}
