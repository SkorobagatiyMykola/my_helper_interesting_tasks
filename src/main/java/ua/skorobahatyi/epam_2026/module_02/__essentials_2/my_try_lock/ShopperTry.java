package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_try_lock;

import ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_reentrant_lock.Shopper;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShopperTry extends Thread {
    private int itemsToAdd = 0; // items this shopper is waiting to add
    private static int itemsOnNotepad = 0; // total items on shared notepad
    private static Lock pencil = new ReentrantLock();

    public ShopperTry(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (itemsOnNotepad <= 20) {
            if ((itemsToAdd > 0) && pencil.tryLock()) {
                try {
                    //pencil.tryLock(); //changed
                    //pencil.lock();
                    itemsOnNotepad += itemsToAdd;
                    System.out.println(this.getName() + " added " + itemsToAdd + " item(s) to notepad.");
                    itemsToAdd = 0;
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    pencil.unlock();
                }
            } else {
                try {
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(this.getName() + " found something to buy.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TryLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread nick = new ShopperTry("Nick");
        Thread olga = new ShopperTry("Olga");
        long start = System.currentTimeMillis();
        nick.start();
        olga.start();
        nick.join();
        olga.join();
        long finish = System.currentTimeMillis();

        System.out.println("Elapsed Time: " + (float) (finish - start) / 1000 + " seconds.");
    }
}

/**
 * Elapsed Time: 6.65 seconds.
 *
 * with tryLock => pencil.tryLock() => Elapsed Time: 2.659 seconds.
 */