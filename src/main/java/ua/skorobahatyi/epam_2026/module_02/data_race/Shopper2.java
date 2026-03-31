package ua.skorobahatyi.epam_2026.module_02.data_race;

public class Shopper2 extends Thread {

    static int count = 0;

    private static synchronized void addGarlic() {
        count++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            addGarlic();
            //count++;
        }
    }
}

class DataRaceDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Data Race");

        Thread th1 = new Shopper2();
        Thread th2 = new Shopper2();

        th1.start();
        th2.start();
        th1.join(); // fixme very cool condition for main class
        th2.join();

        System.out.println("We get count: " + Shopper2.count + " (!)");

    }
}
