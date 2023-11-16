package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 *
 * Handshake
 *https://www.hackerrank.com/challenges/handshake/problem?isFullScreen=true
 * */
public class Handshake {
    public static void main(String[] args) {
        System.out.println(handshake(4));
    }

    private static int handshake(int n) {
        // Write your code here
        if (n<2) {
            return 0;
        } else {
            return n*(n-1)/2;
        }
    }

}
