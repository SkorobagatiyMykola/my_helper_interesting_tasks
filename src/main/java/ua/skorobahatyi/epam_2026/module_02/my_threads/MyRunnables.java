package ua.skorobahatyi.epam_2026.module_02.my_threads;

public class MyRunnables {
    public static void main(String[] args) {
        System.out.println("== Runnable ==");

        Runnable th1 = new MyRunnable();
        Thread th = new Thread(th1);

        th.start();
    }
}
