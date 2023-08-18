package ua.skorobahatyi.tasks_from_leetcode.numbers;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    private static int addDigits(int num) {
        if (num==0)
            return num;
        while (num>9) {
            num = sumDigit(num);
        }

        return num;
    }

    private static int sumDigit(int number) {
        int r;
        int sum = 0;
        while (number > 0) {
            r = (int) (number % 10);
            number = number / 10;
            sum += r;
        }
        return sum;
    }
}
