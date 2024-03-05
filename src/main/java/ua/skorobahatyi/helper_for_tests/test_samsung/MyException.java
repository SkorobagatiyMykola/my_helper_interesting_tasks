package ua.skorobahatyi.helper_for_tests.test_samsung;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyException {
    public static void main(String[] args) throws Throwable {
        System.out.println("==== Test ====");

        Exception e = new IOException();
        //throw new ArithmeticException();
        Object obj = new Object();
        ExecutorService ex1 = Executors.newCachedThreadPool();

       // System.out.println("====================================");
    }
}
