package ua.skorobahatyi.help_for_numbers;

public class SumDigitsForNumber {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(542));
        System.out.println(sumDigits(99));
    }

    private static int sumDigits(long number) {
        int sum = 0;

        while (number > 0) {
            int r = (int) (number % 10);
            sum +=  r;
            number = number / 10;
        }
        return sum;
    }
}
