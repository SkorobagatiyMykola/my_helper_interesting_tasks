package ua.skorobahatyi.tasks_from_leetcode.numbers;

/**
 *69. Sqrt(x)
 *https://leetcode.com/problems/sqrtx/
 *
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Constraints:
 * 0 <= x <= 2^31 - 1
 * */

public class Sqrt {
    public static void main(String[] args) {

        System.out.println(mySqrt(0));
        System.out.println(mySqrt(25));
        System.out.println(mySqrt(198));
        System.out.println(mySqrt(Integer.MAX_VALUE));

    }

    private static int mySqrt(int x) {
        if (x == 0)
            return 0;
        int base = 23175;
        int min = 0;
        int max = 46340;
        while (true) {
            if (min == 46339) {
                base = 46340;
                break;
            }
            if (base * base - x <= 0 && ((base + 1) * (base + 1) - x > 0))
                break;
            if (base * base > x) {
                max = base;
                base = base - (max - min) / 2;
            } else {
                min = base;
                base = base + (max - min) / 2;
            }
        }

        return base;
    }
}
