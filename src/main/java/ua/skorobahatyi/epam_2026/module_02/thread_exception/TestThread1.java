package ua.skorobahatyi.epam_2026.module_02.thread_exception;

public class TestThread1 extends Thread{
    String name;

    public TestThread1(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(1000);
                System.out.println("Hello  Nick, "+i+" times.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
