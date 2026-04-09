package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

public class Customer {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
