package com.github.alexeigrigorev.javatraining.lesson2;

public class TankBodyLine implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new TankBody();
    }
}
