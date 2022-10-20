package com.github.alexeigrigorev.javatraining.lesson2.bank;

public class Decor {
    private String credit;
    private String approved;
    private String agree;
    public Decor() {
        System.out.println("Оформление");
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }
    public String getApproved() {
        return approved;
    }
    public void setApproved(String approved) {
        this.approved = approved;
    }
    public String getAgree() {
        return agree;
    }
    public void setAgree(String agree) {
        this.agree = agree;
    }
}


