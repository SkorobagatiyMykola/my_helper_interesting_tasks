package ua.skorobahatyi.helper_for_tests.it_quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider the following class:
 * Now consider the following code:
 *
 * What will this code output when compiled and run?
 *
 * Pallas [512.00]
 * Juno [258.00]
 * 2044.00
 * 512.00
 * 340.67
 * */
public class Task12 {
    public static void main(String args[]) {
        List<Asteroid> asteroids = new ArrayList<>();
        asteroids.add(new Asteroid("Sylvia", 286));
        asteroids.add(new Asteroid("Pallas", 512));
        asteroids.add(new Asteroid("Eunomia", 268));
        asteroids.add(new Asteroid("Juno", 258));
        asteroids.add(new Asteroid("Hygiea", 431));
        asteroids.add(new Asteroid("Davida", 289));
        Asteroid c = asteroids
                .stream()
                .reduce(asteroids.get(0),
                        (a, b) -> a.getDiameter() > b.getDiameter() ? a : b);
        System.out.println(c);
    }
}

class Asteroid {
    private String name;
    private double diameter;
    public Asteroid(String name, double diameter) {
        this.setName(name);
        this.setDiameter(diameter);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public String toString() {
        return String.format("%s [%.2f]", getName(), getDiameter());
    }
}