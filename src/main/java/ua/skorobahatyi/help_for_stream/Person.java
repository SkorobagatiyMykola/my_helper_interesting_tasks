package ua.skorobahatyi.help_for_stream;

import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }

    public static List<Person> generationPersons(){
        return List.of(new Person("Andrew",63),
                new Person("Igor",23),
                new Person("Ira",23),
                new Person("Vitia",12),
                new Person("Mykola",41),
                new Person("Olga",41),
                new Person("Tanya",12),
                new Person("Pavlo",41),
                new Person("Galina",63),
                new Person("Pavlo",71));
    }
}
