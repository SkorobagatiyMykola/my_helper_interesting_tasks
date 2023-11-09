package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 *
 * Which lines will cause errors when this code is compiled? (Check all that apply.)
 *
 * c.fetch(); // the Canine interface does not include the fetch method
 * a.wagTail(); // the Animal interface does not include the wagTail method a.fetch(); // the Animal interface does not include the fetch method
 * Canine c = new Dog(); Animal a = new Dog(); // you cannot assign an object of type Dog to a variable declared as type Animal or Canine
 * a.move(); // the move method is not implemented in the Animal class
 * None of them. This code compiles with no errors.
 *
 * */

public class Task7 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeNoise();
        d.move();
        d.wagTail();
        d.fetch();
        Canine c = new Dog();
        c.makeNoise();
        c.move();
        c.wagTail();
       // c.fetch();
        Animal a = new Dog();
        a.makeNoise();
        a.move();
        //a.wagTail();
        //a.fetch();
    }

}

abstract class Animal {
    public abstract void makeNoise();

    public abstract void move();
}

abstract class Canine extends Animal {
    public void wagTail() {
        System.out.println("Wagging");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}

class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    public void fetch() {
        System.out.println("Fetch");
    }
}


