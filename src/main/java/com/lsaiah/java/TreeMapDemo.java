package com.lsaiah.java;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Student02, Integer> map = new TreeMap<>(new Comparator<Student02>() {
            public int compare(Student02 p1, Student02 p2) {
                if (p1.score == p2.score) {
                    return 0;
                }
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map.put(new Student02("Tom", 77), 1);
        map.put(new Student02("Bob", 66), 2);
        map.put(new Student02("Lily", 99), 3);
        for (Student02 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student02("Bob", 66)));
    }
}

class Student02 {
    public String name;
    public int score;
    Student02(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}
