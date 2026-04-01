package ua.skorobahatyi.epam_2026.module_02.dead_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Abandoned lock
public class Philosopher2 extends Thread {
    private Lock firstChop, secondChop;
    private static int sushiCount = 100_000; // increase from 5 to 100_000

    public Philosopher2(String name, Lock firstChop, Lock secondChop) {
        super(name);
        this.firstChop = firstChop;
        this.secondChop = secondChop;
    }

    @Override
    public void run() {
        while (sushiCount > 0) {
            firstChop.lock(); // fixme critical section
            secondChop.lock();

            try {
                if (sushiCount > 0) {
                    sushiCount--;
                    System.out.println(this.getName() + " took a piece! Sushi remaiimg: " + sushiCount);
                }

                if (sushiCount == 10) {
                    System.out.println( 5 / 0);
                }
            } finally {
                secondChop.unlock();
                firstChop.unlock();
            }

        }
    }
}

class AbandonedLockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();

        new Philosopher2("Nick", chopstickA, chopstickB).start();
        new Philosopher2("Olga", chopstickB, chopstickC).start();
        //new Philosopher("Pavlo", chopstickC, chopstickA).start(); //fixme deadlock
        new Philosopher2("Pavlo", chopstickA, chopstickC).start();
    }
}

