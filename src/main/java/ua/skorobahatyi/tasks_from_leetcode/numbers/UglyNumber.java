package ua.skorobahatyi.tasks_from_leetcode.numbers;

/**
 * 263. Ugly Number
 *
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 *
 * Given an integer n, return true if n is an ugly number.
 * */
public class UglyNumber {

    public static void main(String[] args) {
        System.out.println(isUgly(98));
    }

    private static  boolean isUgly(int n) {
        while(true) {
            if (n%2==0) {
                n=n/2;
            } else if (n%3==0) {
                n=n/3;
            } else if (n%5==0) {
                n=n/5;
            } else{
                break;
            }
        }
        return n==1? true : false;
    }
}
