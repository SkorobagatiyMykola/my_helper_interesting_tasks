package ua.skorobahatyi.epam_2026.module_02.dead_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTesters extends Thread {
    private Lock firstChop, secondChop;
    private static int sushiCount = 100_000; // increase from 5 to 100_000

    public MyTesters(String name, Lock firstChop, Lock secondChop) {
        super(name);
        this.firstChop = firstChop;
        this.secondChop = secondChop;
    }

    @Override
    public void run() {
        while (sushiCount > 0) {
            firstChop.lock();
            secondChop.lock();

            if (sushiCount > 0) {
                sushiCount--;
                System.out.println(this.getName() + " took a piece! Sushi remaining: " + sushiCount);
            }

            secondChop.unlock();
            firstChop.unlock();
        }
    }
}

class MyTest {
    public static void main(String[] args) {
        System.out.println("==== My Deadlock ====");
        Lock lockFirst = new ReentrantLock();
        Lock lockSecond = new ReentrantLock();

        new MyTesters("Nick", lockFirst, lockSecond).start();
       // new MyTesters("Olga", lockSecond, lockFirst).start();// deadlock
        new MyTesters("Olga", lockFirst, lockSecond).start();// fixme deadlock
    }
}