package ua.skorobahatyi.design_patterns.structural_patterns.decorator_epam;

public class StarbuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        //beverage = new Whip(beverage);
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);


        System.out.println(beverage.getDescription()+"  $ "+beverage.cost());
    }
}
