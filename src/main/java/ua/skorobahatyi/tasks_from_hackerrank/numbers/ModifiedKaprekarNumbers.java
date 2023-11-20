package ua.skorobahatyi.tasks_from_hackerrank.numbers;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(1, 100000);
        kaprekarNumbers(400, 700);
    }

    private static void kaprekarNumbers(int p, int q) {
        // Write your code here
        int count=0;
        for (int i = p; i <= q; i++) {

            long sq = 1l * i * i;

            int digits = countDigits(sq) % 2 == 0 ? countDigits(sq) / 2 : countDigits(sq) / 2 + 1;

            int pow = myPow2(digits);
            int z1 = (int) (sq / pow);
            int z2 = (int) (sq % pow);
            if (z1 + z2 == i) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count==0) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println("");
        }
    }

    private static int countDigits(long number) {
        int digits = 0;
        while (number > 0) {
            number = number / 10;
            digits++;
        }
        return digits;
    }

    private static int myPow2(int n) {
        int z = 1;
        for (int i = 0; i < n; i++) {
            z *= 10;
        }
        return z;
    }

}
