package ua.skorobahatyi.task_from_plexsupply.multythread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        String readFileName = "src/main/java/ua/skorobahatyi/task_from_plexsupply/input1.txt";
        String writeFileName = "output.txt";

        new Thread(new FileProducer(queue, readFileName)).start();
        Thread.sleep(100);
        new Thread(new FileConsumer(queue, writeFileName)).start();

    }
}
