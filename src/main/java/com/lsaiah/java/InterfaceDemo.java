package com.lsaiah.java;

//TODO:用接口给一个有工资收入和稿费收入的小伙伴算税。
public class InterfaceDemo {
    public static void main(String[] args) {
        Income02[] incomes02 = new Income02[]{
                new Salary02(7500),
                new Royalty02(15000)
        };
        double totalTax = 0;
        for (Income02 income02: incomes02) {
            totalTax+=income02.getTax();
        }
        System.out.println(totalTax);
    }
}

interface Income02 {
    double getTax();
}

class Salary02 implements Income02{
    private double income;
    public Salary02(double income){
        this.income = income;
    }
    @Override
    public double getTax() {
        if (income < 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
class Royalty02 implements Income02{
    private double income;
    public Royalty02(double income){
        this.income = income;
    }
    @Override
    public double getTax() {
        return 0;
    }
}