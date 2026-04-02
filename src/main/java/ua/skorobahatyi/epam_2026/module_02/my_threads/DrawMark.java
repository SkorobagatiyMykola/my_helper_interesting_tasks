package ua.skorobahatyi.epam_2026.module_02.my_threads;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

import static java.lang.Thread.sleep;


public class DrawMark extends Thread {

    private char mark;
    private AtomicInteger count;
    private Lock firstLock;
    private Lock secondLock;

    public DrawMark(char mark, AtomicInteger count, Lock firstLock, Lock secondLock) {
        this.mark = mark;
        this.count = count;
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    @SneakyThrows
    @Override
    public void run() {

        while (count.get() < 50) {
            firstLock.lock();
            secondLock.lock();

            count.incrementAndGet();
            System.out.print(mark);
            if (count.incrementAndGet() % 11 == 0) {
               //System.out.print(Thread.currentThread().getName()+" ");
                System.out.print("\n");
            }
            //System.out.println(mark+ " thread: "+Thread.currentThread().getName());

            firstLock.unlock();

            sleep(100);
            secondLock.unlock();

        }

    }
}
