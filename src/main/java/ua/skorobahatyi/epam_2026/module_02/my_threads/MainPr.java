package ua.skorobahatyi.epam_2026.module_02.my_threads;

import static java.lang.Thread.sleep;

public class MainPr {
    public static void main(String[] args) throws InterruptedException {
        //Thread.currentThread().fork(new Runnable() {});
        System.out.println("============== Main Program ================");
        Thread thread1 = new MyThreads("First");
        System.out.println(thread1.getName()+" is state: "+thread1.getState());
        //thread1.setDaemon(true);
        Thread thread2 = new MyThreads("Second");
        //thread2.setPriority(1);
        //thread2.setDaemon(true);
        System.out.println("!: th1, id is: "+thread1.getId());
        System.out.println("!: th2, id is: "+thread2.getId());

        thread1.start();
        thread2.start();
        System.out.println(thread1.getName()+" is state: "+thread1.getState());
        //thread1.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("I am main");
            System.out.println(thread1.getName()+" is state: "+thread1.getState());
            sleep(700);
        }

        System.out.println(thread1.getName()+" is state: "+thread1.getState());
        System.out.println("==============THE END============");

    }
}
