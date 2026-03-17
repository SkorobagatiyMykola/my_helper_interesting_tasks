package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.75;
    }
}
