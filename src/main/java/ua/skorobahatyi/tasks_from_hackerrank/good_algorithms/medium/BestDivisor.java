package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.medium;


/**
 * https://www.hackerrank.com/challenges/best-divisor/problem?isFullScreen=true
 * Best Divisor
 *
 * */
public class BestDivisor {
    public static void main(String[] args) {
        System.out.println(findBestDivisor(12));
    }


    private static int sumDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int r = (int) (num % 10);
            sum += r;
            num = num / 10;
        }
        return sum;
    }

    private static int findBestDivisor(int num) {
        //int maxDev = (int) (Math.sqrt(num) + 1);

        int res = 1;
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && sumDigits(i) >sum) {
                res=i;
                sum=sumDigits(i);
            }
        }


        return res;
    }
}
