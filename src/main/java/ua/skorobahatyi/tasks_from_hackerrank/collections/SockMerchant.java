package ua.skorobahatyi.tasks_from_hackerrank.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 * <p>
 * Example
 * <p>
 * There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 */
public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        sockMerchant(list1.size(), list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
        sockMerchant(list2.size(), list2);

    }

    private static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        Collections.sort(ar);

        int color = 1;
        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i) == ar.get(i + 1)) {
                color++;
            } else {
                count += color / 2;
                color = 1;
            }
        }
        count += color / 2;
        System.out.println(count);

        return count;
    }
}
