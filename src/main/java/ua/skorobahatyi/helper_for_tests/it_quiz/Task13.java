package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 *
 * What is the output of the following code?
 *
 *
 *
 *
 * My pet is playing with a ball
 * My cat is playing with a ball
 * My pet is playing with a shape
 * My cat is playing with a shape (!!!!)
 *
 * */
public class Task13 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        Ball ball = new Ball();
        System.out.println(String.format("My %s is playing with a %s",
                pet.getName(), ball.getName()));
    }
}

class Pet {
    public String getName() {
        return "pet";
    }
}
class Cat extends Pet {
    @Override
    public String getName() {
        return "cat";
    }
}
class Shape {
    private String name;
    public Shape() {
        name = "shape";
    }
    public String getName() {
        return name;
    }
}
class Ball extends Shape {
    private String name;
    public Ball() {
        name = "ball";
    }
}