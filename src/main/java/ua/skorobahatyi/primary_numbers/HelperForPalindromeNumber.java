package ua.skorobahatyi.primary_numbers;

public class HelperForPalindromeNumber {

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

}
