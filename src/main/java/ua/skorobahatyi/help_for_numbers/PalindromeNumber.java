package ua.skorobahatyi.help_for_numbers;

/**
 * Polindrome
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pl = new PalindromeNumber();
        System.out.println(pl.countDigits(100));
        System.out.println(pl.countDigits(5));
        System.out.println(pl.countDigits(1234567890));
    }

    public boolean isPalindrome(long number) {

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

    public int countDigits(long number) {

        int digits = 0;
        while (number > 0) {
            number = number / 10;
            digits++;
        }
        return digits;
    }


}
