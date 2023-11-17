package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 * Restaurant
 * https://www.hackerrank.com/challenges/restaurant/problem?isFullScreen=true
 * */
public class Restaurant {
    public static void main(String[] args) {
        System.out.println(restaurant(6,9));
        System.out.println(restaurant(5,5));
    }

    private static int restaurant(int l, int b) {
        // Write your code here
        int min = l>b? b: l;
        int rez=1;
        for (int i = 1; i <= min; i++) {
            if (b%i==0&&l%i==0)
                rez=i*i;
        }

        return  l*b/rez;

    }
}
