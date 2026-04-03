package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_reentrant_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper extends Thread{

    static int garlicCount, potatoCount =0;
    static Lock pencil = new ReentrantLock();

    private void addGarlic(){
        pencil.lock();
        garlicCount++;
        pencil.unlock();
    }
    private void addPotato(){
        pencil.lock();
        potatoCount++;
        pencil.unlock();
    }

    @Override
    public void run() {
        super.run();
    }
}
