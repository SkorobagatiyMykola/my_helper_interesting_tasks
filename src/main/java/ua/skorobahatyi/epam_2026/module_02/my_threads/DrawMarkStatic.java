package ua.skorobahatyi.epam_2026.module_02.my_threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DrawMarkStatic extends Thread {
    private static Lock firstLock = new ReentrantLock();
    private static Lock secondLock = new ReentrantLock();
    private static AtomicInteger count=new AtomicInteger(1);

    private char mark;

    public DrawMarkStatic(char mark) {
        this.mark = mark;
    }

    @Override
    public void run() {
        while (count.get() < 9) {
            firstLock.lock();
            secondLock.lock();


            System.out.println(mark+" - "+count.get());
            count.incrementAndGet();

            firstLock.unlock();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            secondLock.unlock();

        }

    }
}
