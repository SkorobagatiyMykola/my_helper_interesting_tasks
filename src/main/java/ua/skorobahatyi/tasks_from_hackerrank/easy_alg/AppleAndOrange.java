package ua.skorobahatyi.tasks_from_hackerrank.easy_alg;

import java.util.Arrays;
import java.util.List;

/**
 *Apple and Orange
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
 *
 * */
public class AppleAndOrange {
    public static void main(String[] args) {
        Integer[] arr1 = {-2, 2, 1};
        Integer[] arr2 = { 5, -6};


        List<Integer> listApples = Arrays.asList(arr1);
        List<Integer> listOranges = Arrays.asList(arr2);

        countApplesAndOranges(7,11,5,15,listApples,listOranges);

    }

    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i)+a);
        }

        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i)+b);
        }

        int countA=0, countO=0;

        for (Integer apple : apples) {
            if (apple>=s&&apple<=t)
                countA++;
        }

        for (Integer orange : oranges) {
            if (orange>=s&&orange<=t)
                countO++;
        }
        System.out.println(countA);
        System.out.println(countO);

    }
}
