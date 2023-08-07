package ua.skorobahatyi.help_for_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Condition of the problem:
 * <p>
 * Find the largest palindrome which is product of two 5-digit prime numbers.
 */

public class TaskPrimaryNumber {

    private static int[] arrayPrimaryNumberForCheck = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
            61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
            179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,
            293, 307, 311, 313, 317};


    public static void main(String[] args) {
        System.out.println("Solution of the problem:");
        HelperForPrimeNumber helperPrimeNum = new HelperForPrimeNumber();


        List<Integer> list_5digitPrimeNum = new ArrayList<>();

        for (int i = 10000; i < 100000; i++) {
            if (helperPrimeNum.isPrimeNumberQuickCheck(i, arrayPrimaryNumberForCheck)) {
                list_5digitPrimeNum.add(i);
            }
        }

        HelperForPalindromeNumber helperPalindrome = new HelperForPalindromeNumber();
        long maxPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;
        for (int number1 = 0; number1 < list_5digitPrimeNum.size(); number1++) {
            for (int number2 = number1; number2 < list_5digitPrimeNum.size(); number2++) {
                long product = Math.multiplyFull(list_5digitPrimeNum.get(number1), list_5digitPrimeNum.get(number2));
                if ((helperPalindrome.isPalindrome(product)) && (product > maxPalindrome)) {
                    maxPalindrome = product;
                    factor1 = list_5digitPrimeNum.get(number1);
                    factor2 = list_5digitPrimeNum.get(number2);
                }
            }
        }

        String message = "The largest palindrome %d is the product of two prime 5-digit numbers %d and %d.";
        System.out.println(String.format(message, maxPalindrome, factor1, factor2));
    }

}
