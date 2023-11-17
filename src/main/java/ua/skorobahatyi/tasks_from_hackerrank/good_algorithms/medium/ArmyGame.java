package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.medium;

public class ArmyGame {

    public static void main(String[] args) {
        System.out.println(gameWithCells(8, 10));
        System.out.println(gameWithCells(5, 7));
    }

    private static int gameWithCells(int n, int m) {
        // Write your code here
        int height = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int width = m % 2 == 0 ? m / 2 : m / 2 + 1;

        return height*width;
    }
}
