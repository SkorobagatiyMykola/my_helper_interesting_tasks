package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        //this.beverage.setDescription(beverage.getDescription()+", Milk");
    }

    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
