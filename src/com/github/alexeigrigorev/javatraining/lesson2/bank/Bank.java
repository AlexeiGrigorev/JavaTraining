package com.github.alexeigrigorev.javatraining.lesson2.bank;

public class Bank {
    private String name;
    private String surname;
    private int age;
    private String work;
    public Bank() {
        System.out.println("Банк");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
}
