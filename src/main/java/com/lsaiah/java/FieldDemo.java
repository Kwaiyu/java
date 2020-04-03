package com.lsaiah.java;

import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) throws Exception {
        Person05 p = new Person05("张三");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
        f.set(p,"李四");
        Object newValue = f.get(p);
        System.out.println(newValue);
    }
}
class Person05{
    public Person05(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    private String name;
}
