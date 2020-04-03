package com.lsaiah.java;

//TODO:给一个有工资收入和稿费收入的小伙伴算税。
public class PolymorphicDemo {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new Royalty(15000)
        };
        double totalTax = 0;
        for (Income income : incomes){
            totalTax+=income.getTax();
        }
        System.out.println(totalTax);
    }
}

class Income {
    //Income构造方法，传递参数income
    public Income(double income) {
        this.income = income;
    }
    //Income类计算税率的方法
    public double getTax(){

        return income * 0.1;
    }
    protected double income;
}

class Salary extends Income{

    public Salary(double income) {

        super(income);
    }
    @Override
    public double getTax() {
        if (income < 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class Royalty extends Income{

    public Royalty(double income) {

        super(income);
    }
    @Override
    public double getTax() {

        return 0;
    }
}
