package ua.skorobahatyi.epam_2026.module_02.data_race;

import java.util.concurrent.atomic.AtomicInteger;

public class Shopper extends Thread {

    //static int count = 0;
    static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count.incrementAndGet();
            //count++;
        }
    }
}

class DataRaceDemo{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Data Race");

        Thread th1= new Shopper();
        Thread th2= new Shopper();

        th1.start();
        th2.start();
        th1.join(); // fixme very cool condition for main class
        th2.join();

        System.out.println("We get count: "+Shopper.count+" (!)");

    }
}
