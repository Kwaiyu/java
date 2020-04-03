package com.lsaiah.java;

public class ExtendsDemo {
    public static void main(String[] args) {
        Person p = new Person("张三", 20);
        Student s = new Student("李四", 15, 60);
        PrimaryStudent ps = new PrimaryStudent("张三", 10, 100, 5);
        System.out.println("姓名"+ ps.getName() + "年龄"+ps.getAge() + "分数"+ ps.getScore() + "年级"+ps.getGrade());
    }
}

class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    protected String name;
    protected int age;
}

class Student extends Person{
    public int getScore() {
        return score;
    }
    public Student(String name, int age, int score){
        super(name,age);
        this.score = score;
    }

    protected int score;
}

class PrimaryStudent extends Student{
    public int getGrade() {
        return grade;
    }
    protected int grade;

    public PrimaryStudent(String name, int age, int score,int grade) {
        super(name, age, score);
        this.grade = grade;
    }
}