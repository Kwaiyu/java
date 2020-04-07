package com.lsaiah.java;

import java.util.List;
import java.util.Objects;

public class EqualsDemo {
    public static void main(String[] args) {
        List<Person06> list = List.of(
                new Person06("Xiao", "Ming", 18),
                new Person06("Xiao", "Hong", 25),
                new Person06("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person06("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person06 {
    String firstName;
    String lastName;
    int age;
    public Person06(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Person06) {
            Person06 p = (Person06) o;
            return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
        }
        return false;
    }
}