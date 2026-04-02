package ua.skorobahatyi.epam_2026.module_02.my_threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainDraw {
    public static void main(String[] args) {
        System.out.println("Draw X and 0 ");
        System.out.println("===== Start =====");
        AtomicInteger count = new AtomicInteger(0);
        Lock firstLock = new ReentrantLock();
        Lock secondLock = new ReentrantLock();

        DrawMark drawMark_X = new DrawMark('X', count, firstLock,secondLock);
        DrawMark drawMark_O = new DrawMark('O', count, firstLock,secondLock);

        drawMark_X.start();
        drawMark_O.start();
    }
}
