package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 * https://www.hackerrank.com/challenges/leonardo-and-prime/problem?isFullScreen=true
 * */
public class LeonardosPrimeFactors {

    public static void main(String[] args) {
        System.out.println(primeCount(1));
        System.out.println(primeCount(2));
        System.out.println(primeCount(3));
        System.out.println(primeCount(500));
        System.out.println(primeCount(5000));
        System.out.println(primeCount(10000000000l));
    }

    private static int primeCount(long n) {
        // Write your code here
        int[] arrayPrimes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,57,59,61,};
        long z=1;
        int count=0;
        for (int i = 0; i < arrayPrimes.length; i++) {
            z*=arrayPrimes[i];
            if (z>n || z<0)
                break;
            count++;
        }

        return count;
    }
}
