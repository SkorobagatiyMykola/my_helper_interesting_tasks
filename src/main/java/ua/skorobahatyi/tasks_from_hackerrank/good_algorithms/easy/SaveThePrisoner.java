package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true
 *
 * */
public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5,2,1));
    }

    private static int saveThePrisoner(int n, int m, int s) {
        // Write your code here

        int z=(m-1)%n;

        return s+z>n? s+z-n:s+z;

    }
}
