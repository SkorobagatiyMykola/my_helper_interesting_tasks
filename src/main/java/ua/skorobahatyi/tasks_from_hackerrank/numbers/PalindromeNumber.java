package ua.skorobahatyi.tasks_from_hackerrank.numbers;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(123444));
    }

    private static boolean isPalindrome(long number) {

        int r = 0;
        long sum = 0;
        long temp = number;

        while (number > 0) {
            r = (int) (number % 10);
            sum = (sum * 10) + r;
            number = number / 10;
        }
        return temp == sum ? true : false;
    }

    private static long reverseNumber(long number) {

        int r = 0;
        long reverse = 0;

        while (number > 0) {
            r = (int) (number % 10);
            reverse = (reverse * 10) + r;
            number = number / 10;
        }
        return reverse;
    }
}
