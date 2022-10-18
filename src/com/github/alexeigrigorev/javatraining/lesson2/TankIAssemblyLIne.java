package com.github.alexeigrigorev.javatraining.lesson2;

public class TankIAssemblyLIne implements IAssemblyLine {
    @Override
    public Tank assembleProduct() {
        TankBodyLine tankBodyLine = new TankBodyLine();
        IProductPart tankBody = tankBodyLine.buildProductPart();

        TankEngineLine tankEngineLine = new TankEngineLine();
        IProductPart tankEngine = tankEngineLine.buildProductPart();

        TankTowerLine tankTowerLine = new TankTowerLine();
        IProductPart tankTower = tankTowerLine.buildProductPart();
        System.out.println("Перекур");

        Tank tank = new Tank();
        tank.installFirstPart(tankBody);
        tank.installSecondPart(tankEngine);
        tank.installThirdPart(tankTower);
        System.out.println("Конец сборки");
        return tank;
    }
}
