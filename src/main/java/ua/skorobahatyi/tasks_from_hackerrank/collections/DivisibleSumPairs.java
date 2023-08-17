package ua.skorobahatyi.tasks_from_hackerrank.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
 *
 * Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
 *
 * */

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));

        System.out.println(divisibleSumPairs(6,3,list));

    }

    private static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if ((ar.get(i)+ar.get(j))%k==0){
                    count++;
                }
            }
        }

        return count;

    }
}
