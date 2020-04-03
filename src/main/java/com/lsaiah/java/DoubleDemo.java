package com.lsaiah.java;

public class DoubleDemo {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // TODO:根据一元二次方程ax^2+bx+c=0ax2+bx+c=0的求根公式：
        double r1 = 0;
        double r2 = 0;
        r1 = (Math.sqrt(b*b - 4*a*c)-b) /2*a;
        r2 = (Math.sqrt(b*b - 4*a*c)+b) /2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == 4 ? "测试通过" : "测试失败");
    }
}
