package com.github.alexeigrigorev.javatraining.lesson2.bank;

public class Credit {
    private String house;
    private String car;
    private String other;
    public Credit() {
        System.out.println("Кредит");
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }
}
