package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public abstract class Beverage {

    String description ="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract  double cost();

    public void setDescription(String description) {
        this.description = description;
    }
}
