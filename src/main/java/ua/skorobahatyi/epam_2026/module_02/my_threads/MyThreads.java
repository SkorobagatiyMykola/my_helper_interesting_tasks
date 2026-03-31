package ua.skorobahatyi.epam_2026.module_02.my_threads;

import lombok.SneakyThrows;

public class MyThreads extends Thread{
    public MyThreads(String name) {
        super(name);
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Thread "+this.getName()+" is working");

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+" am working "+i+" times.");
            sleep(500);
        }
    }
}
