package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class Espresso extends Beverage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return .91;
    }
}
