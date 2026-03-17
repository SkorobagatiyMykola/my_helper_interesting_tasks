package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
