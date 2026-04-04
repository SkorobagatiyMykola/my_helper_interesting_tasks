package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class CellPhone extends Thread{

    private static Semaphore charge = new Semaphore(4);
    //private static Semaphore charge = new Semaphore(1); Binary semaphore

    public CellPhone(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        try {
            charge.acquire();
            System.out.println(this.getName()+" is charging ...");
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000,2000));
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            System.out.println(this.getName()+" is DONE charging!");
            charge.release();
        }
    }
}

class SemaphoreDemo{
    public static void main(String[] args) {
        System.out.println("=========================");
        for (int i = 0; i < 10; i++) {
            new CellPhone("Phone-"+i).start();
        }
    }
}