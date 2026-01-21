package ua.skorobahatyi.new_work_2025.insure;

import java.util.Objects;

public class User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return age == user1.age && name.equals(user1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
