package ua.skorobahatyi.epam_2026.module_02.my_threads;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{
    @SneakyThrows
    @Override
    public void run() {
        //Lock lock = new ReentrantLock();
        for (int i = 0; i < 3; i++) {
            System.out.println("Runnable");
            sleep(700);
        }

    }
}
