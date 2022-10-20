package com.github.alexeigrigorev.javatraining.lesson2.bank;

public class Main {
    public static void main(String[] Args) {
        Bank bank = new Bank();
        bank.setName("");
        bank.setSurname("");
        bank.setAge(32);
        bank.setWork("");

        Debit debit = new Debit();
        debit.setBest("");
        debit.setGreat("");

        Credit credit = new Credit();
        credit.setHouse("");
        credit.setCar("");
        credit.setOther("");

        Decor decor = new Decor();
        decor.setCredit("");
        decor.setApproved("");
        decor.setAgree("");
    }
}
