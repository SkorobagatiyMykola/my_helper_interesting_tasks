package ua.skorobahatyi.epam_2026.module_02.livelock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosophe extends Thread {
    private Lock firstChop, secondChop;
    private static int sushiCount = 100_000; // increase from 5 to 100_000
    private Random rps = new Random();

    public Philosophe(String name, Lock firstChop, Lock secondChop) {
        super(name);
        this.firstChop = firstChop;
        this.secondChop = secondChop;
    }

    @Override
    public void run() {
        while (sushiCount > 0) {
            firstChop.lock();
            if (secondChop.tryLock()) {
                System.out.println(this.getName() + " released their first chopstick.");
                firstChop.unlock();
                try {
                    Thread.sleep(rps.nextInt(3));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {

                if (sushiCount > 0) {
                    sushiCount--;
                    System.out.println(this.getName() + " took a piece! Sushi remaiimg: " + sushiCount);
                }

                secondChop.unlock();
                firstChop.unlock();
            }
        }
    }
}

class DeadLockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();

        new Philosophe("Nick", chopstickA, chopstickB).start();
        /*new Philosophe("Olga", chopstickA, chopstickB).start();
        new Philosophe("Pavlo", chopstickA, chopstickB).start();*/
        new Philosophe("Olga", chopstickB, chopstickC).start();
        //new Philosophe("Pavlo", chopstickC, chopstickA).start(); //fixme deadlock*/
        new Philosopher("Pavlo", chopstickC, chopstickA).start();
    }
}
