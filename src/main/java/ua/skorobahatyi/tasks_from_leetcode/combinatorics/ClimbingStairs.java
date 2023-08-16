package ua.skorobahatyi.tasks_from_leetcode.combinatorics;

import java.util.ArrayList;
import java.util.List;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // Output: 2
        System.out.println(climbStairs(3)); // Output: 3
        System.out.println(climbStairs(4)); // Output: 5
        System.out.println(climbStairs(5)); // Output: 8

    }

    private static int climbStairs(int n) {
        if (n==1)
            return 1;
        else if (n==2)
            return 2;
        else {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            for (int i = 0; i < n-2; i++) {
                list.add(list.get(i)+list.get(i+1));
            }
            return list.get(n-1);
        }

    }
}
