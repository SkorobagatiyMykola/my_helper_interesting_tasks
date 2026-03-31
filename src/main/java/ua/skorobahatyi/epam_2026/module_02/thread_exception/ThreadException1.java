package ua.skorobahatyi.epam_2026.module_02.thread_exception;

public class ThreadException1 {
    public static void main(String[] args) {
        System.out.println("==== Test threads ====");
        TestThread1 testThread1 = new TestThread1("Thread Nick");

        testThread1.start();
        testThread1.interrupt();



    }
}
