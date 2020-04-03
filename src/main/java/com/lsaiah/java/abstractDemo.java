package com.lsaiah.java;

//TODO:用抽象类给一个有工资收入和稿费收入的小伙伴算税。
public class abstractDemo {
    public static void main(String[] args) {
        Income01[] incomes01 = new Income01[]{
          new Income01(3000) {
              @Override
              double getTax() {
                  return income * 0.1;
              }
          },
          new Salary01(7500),
          new Royalty01(15000)
        };
        double totalTax = 0;
        for (Income01 income01:incomes01) {
            totalTax+=income01.getTax();
        }
        System.out.println(totalTax);
    }
}

abstract class Income01{
    protected double income;
    public Income01(double income){
        this.income = income;
    };
    abstract double getTax();
}

class Salary01 extends Income01{
    public Salary01(double income) {
        super(income);
    }
    @Override
    double getTax() {
        if (income < 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class Royalty01 extends Income01{
    public Royalty01(double income) {
        super(income);
    }
    @Override
    double getTax() {
        return 0;
    }
}