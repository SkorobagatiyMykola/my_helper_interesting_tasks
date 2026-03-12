package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        System.out.println("====== Strategy  =====");

        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

    }
}
