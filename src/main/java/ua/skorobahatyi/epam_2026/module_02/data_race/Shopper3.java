package ua.skorobahatyi.epam_2026.module_02.data_race;

public class Shopper3 extends Thread {

    //static int count = 0;
    static Integer count = 0;


    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            //synchronized (Shopper3.class) {
            //synchronized (this) { // fixme error
            synchronized (count) { // fixme error data race still exists. integer object is immutable
                count++;
            }
        }
    }
}

class DataRaceDemo3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Data Race3 ===");

        Thread th1 = new Shopper3();
        Thread th2 = new Shopper3();

        th1.start();
        th2.start();
        th1.join(); // fixme very cool condition for main class
        th2.join();

        System.out.println("We get count: " + Shopper3.count + " (!)");

    }
}
