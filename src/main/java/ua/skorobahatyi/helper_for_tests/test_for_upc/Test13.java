package ua.skorobahatyi.helper_for_tests.test_for_upc;

abstract public class Test13 implements Runnable {
    private Object lock = new Object();
    public void lock() {
        synchronized (lock) {
            try {
               // System.out.println("1");
                lock.wait();
                System.out.println("1");
            } catch (InterruptedException e) {
            }
        }
    }
    public void unlock() {
        synchronized (lock) {
            lock.notify();
            System.out.println("2");
        }
    }
    public static void main(String s[]) {
        new Thread(new Test13() {
            public void run() {
                lock();
            }
        }).start();
        new Thread(new Test13() {
            public void run() {
                unlock();
            }
        }).start();
    }
}