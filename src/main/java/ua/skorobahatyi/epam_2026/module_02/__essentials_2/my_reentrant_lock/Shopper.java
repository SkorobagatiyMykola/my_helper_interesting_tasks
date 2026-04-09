package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_reentrant_lock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper extends Thread{

    static int garlicCount, potatoCount =0;
    //static Lock pencil = new ReentrantLock();
    static ReentrantLock pencil = new ReentrantLock(); // changed

    private void addGarlic(){
        pencil.lock();
        System.out.println("Hold count: "+pencil.getHoldCount());
        garlicCount++;
        pencil.unlock();
    }
    private void addPotato(){
        pencil.lock();
        potatoCount++;
        addGarlic(); // Added (*)
        pencil.unlock();
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            addGarlic();
            sleep(200);
           // addPotato();
        }
    }
}

class ReentrantLockDemo{
    public static void main(String[] args) throws InterruptedException {
        Thread nick = new Shopper();
        Thread olga = new Shopper();
        nick.start();
        olga.start();
        nick.join();
        olga.join();

        System.out.println("We should buy "+Shopper.garlicCount+" garlic.");
        System.out.println("We should buy "+Shopper.potatoCount+" potatoes.");

    }
}