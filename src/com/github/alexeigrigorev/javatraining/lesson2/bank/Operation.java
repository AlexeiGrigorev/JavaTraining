package com.github.alexeigrigorev.javatraining.lesson2.bank;

public class Operation implements Bank {
    @Override
    public void credit() {
        System.out.println("Дать кредит");
    }
    @Override
    public void deposit() {
        System.out.println("Положить вклад");
    }
    public static void main(String[] Args){
        Operation operation = new Operation();
        operation.credit();
        operation.deposit();
    }
}
