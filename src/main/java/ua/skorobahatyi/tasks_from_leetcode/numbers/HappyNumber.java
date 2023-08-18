package ua.skorobahatyi.tasks_from_leetcode.numbers;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

//        System.out.println(sumSquareDigit(553));
        System.out.println(isHappy(553));
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    private static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while (true) {
            n = sumSquareDigit(n);
            if (n==1)
                return true;
            if (set.contains(n))
                return false;
            else
                set.add(n);
        }
    }

    private static void test(int number) {
        int r;
        while (number > 0) {
            r = (int) (number % 10);
            number = number / 10;
            System.out.println(r);
        }
    }

    private static int sumSquareDigit(int number) {
        int r;
        int sum = 0;
        while (number > 0) {
            r = (int) (number % 10);
            number = number / 10;
            sum += r * r;
        }
        return sum;
    }
}


/*
*
*  while (number > 0) {
            r = (int) (number % 10);
            sum = (sum * 10) + r;
            number = number / 10;
        }
* */