package ua.skorobahatyi.epam_2026.module_02.__jvm_memory;

public class ExampleStackOverflow {
    public ExampleStackOverflow() {
        new ExampleStackOverflow();
    }

    public static void main(String[] args) {
        new ExampleStackOverflow();
    }
}
