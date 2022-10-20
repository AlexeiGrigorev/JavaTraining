package com.github.alexeigrigorev.javatraining.lesson2;

public class Main {
    public static void main(String[] Args) {
        System.out.println("Начинаем сборку");
        IAssemblyLine line = new TankIAssemblyLIne();
        IProduct product =  line.assembleProduct();
    }
}
