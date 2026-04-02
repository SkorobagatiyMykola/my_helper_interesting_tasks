package ua.skorobahatyi.epam_2026.module_02.livelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher extends Thread {
    private Lock firstChop, secondChop;
    private static int sushiCount = 500_000; // increase from 5 to 100_000

    public Philosopher(String name, Lock firstChop, Lock secondChop) {
        super(name);
        this.firstChop = firstChop;
        this.secondChop = secondChop;
    }

    @Override
    public void run() {
        int sushiEaten=0;
        while (sushiCount > 0) {
            firstChop.lock();
            secondChop.lock();

            if (sushiCount > 0) {
                sushiCount--;
                sushiEaten++;
                System.out.println(this.getName() + " took a piece! Sushi remaiimg: " + sushiCount);
            }

            firstChop.unlock();
            secondChop.unlock();
            //firstChop.unlock();
        }
        System.out.println(this.getName()+" took "+sushiEaten);
    }
}

class LifeLockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();


        new Philosopher("Nick", chopstickA, chopstickB).start();
        new Philosopher("Olga", chopstickB, chopstickC).start();
        new Philosopher("Pavlo", chopstickC, chopstickA).start(); //fixme deadlock

        /*new Philosopher("Nick", chopstickA, chopstickB).start();
        //new Philosopher("Olga", chopstickA, chopstickB).start(); // very greedy
        new Philosopher("Olga", chopstickB, chopstickC).start(); // very greedy
        new Philosopher("Pavlo", chopstickA, chopstickC).start();*/
    }
}
