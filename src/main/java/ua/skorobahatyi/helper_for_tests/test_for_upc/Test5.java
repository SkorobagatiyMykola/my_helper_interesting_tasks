package ua.skorobahatyi.helper_for_tests.test_for_upc;

public class Test5 {
    public static void main(String[] args) {
        Animal an = new Dog();
        System.out.println(an.name + " "+an.maleNoise());
    }
}

class Animal {
    String name = "animal";

    String maleNoise() {
        return "generic mode";
    }
}

class Dog extends Animal {
    String name = "dog";

    String maleNoise() {
        return "bark";
    }
}