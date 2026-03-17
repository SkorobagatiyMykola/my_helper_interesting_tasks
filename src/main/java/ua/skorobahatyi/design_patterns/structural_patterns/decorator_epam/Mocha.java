package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        //this.beverage.setDescription(beverage.getDescription()+", Mocha ");
    }

    @Override
    public double cost() {
        return beverage.cost()+0.05;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha ";
    }
}
