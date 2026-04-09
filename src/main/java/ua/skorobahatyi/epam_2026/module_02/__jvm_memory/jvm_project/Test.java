package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

public class Test {
    public static void main(String[] args) {
        while (true){
            for (int i = 0; i < 10_000_000; i++) {
                Customer customer = new Customer("test"+i);

            }
        }
    }
}
