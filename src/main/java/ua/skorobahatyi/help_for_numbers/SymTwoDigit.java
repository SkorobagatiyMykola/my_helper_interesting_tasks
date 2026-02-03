package ua.skorobahatyi.help_for_numbers;


/**
 *
 * Знайдіть двозначне число, сума цифр якого не змінюється при множенні на будь-яке однозначне число.
 */
public class SymTwoDigit {
    private static final int from = 11;
    private static final int to = 99;

    public static void main(String[] args) {
        System.out.println(" ");
        checkSolution2();

        for (int i = from; i <= to; i++) {
            int sumTest = sumDigit(i);
            int iter = 0;
            int count = 0;
            for (int j = 2; j <= 9; j++) {
                iter++;
                if (sumDigit(i * j) != sumTest)
                    break;
                if (j == 9)
                    System.out.print(i+" ");
            }
        }
    }

    private static void checkSolution() {
        int[] arr = {123, 2345, 34, 67, 5444, 100, 600};

        for (int num : arr) {
            System.out.println(num + ", sum digit:" + sumDigit(num));
        }
    }

    private static void checkSolution2() {
        int[] arr = {18, 45, 90, 99};

        for (int num : arr) {
            for (int i = 1; i <10 ; i++) {
                System.out.print(num*i+"\t");
            }
            System.out.println();
        }
    }

    private static int sumDigit(int num) {
        int sum = 0;
        while (num >= 10) {
            int ost = num % 10;
            sum += ost;
            num = (num - ost) / 10;

        }
        return sum + num;
    }
}
