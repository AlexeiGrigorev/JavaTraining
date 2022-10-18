package com.github.alexeigrigorev.javatraining.lesson2;

public class Tank implements IProduct {
    @Override
    public void installFirstPart(IProductPart productPart) {
        System.out.println("Установили корпус");
    }
    @Override
    public void installSecondPart(IProductPart productPart) {
        System.out.println("Установили двигатель");
    }
    @Override
    public void installThirdPart(IProductPart productPart) {
        System.out.println("Установили башню");
    }
}
