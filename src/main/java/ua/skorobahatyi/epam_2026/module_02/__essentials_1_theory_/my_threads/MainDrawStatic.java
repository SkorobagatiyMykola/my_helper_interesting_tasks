package ua.skorobahatyi.epam_2026.module_02.__essentials_1_theory_.my_threads;

import java.util.concurrent.atomic.AtomicInteger;

public class MainDrawStatic {
    public static void main(String[] args) {
        System.out.println("Draw X and 0 ");
        System.out.println("===== Start =====");
        AtomicInteger count = new AtomicInteger(0);


        DrawMarkStatic drawMark_X = new DrawMarkStatic('X');
        DrawMarkStatic drawMark_O = new DrawMarkStatic('O');

        drawMark_X.start();
        drawMark_O.start();
    }
}
