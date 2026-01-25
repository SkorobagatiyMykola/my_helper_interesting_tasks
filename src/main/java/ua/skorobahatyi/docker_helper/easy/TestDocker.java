package ua.skorobahatyi.docker_helper.easy;

import java.util.Scanner;

public class TestDocker {
    public static void main(String[] args) {
        System.out.println("I am Java Developer ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter an integer: ");

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("Skorobagatyi Mykola");
    }
}
