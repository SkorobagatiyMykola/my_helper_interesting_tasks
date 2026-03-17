package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        //this.beverage.setDescription(beverage.getDescription() + ", Whip");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
