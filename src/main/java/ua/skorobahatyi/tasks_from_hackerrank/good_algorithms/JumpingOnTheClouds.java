package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms;

import java.util.List;

/**
 * Jumping on the Clouds
 * <p>
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(0, 0, 0, 1, 0, 0);
        List<Integer> list2 = List.of(0, 0, 1, 0, 0, 1, 0);

        jumpingOnClouds(list1);
    }

    private static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0, count = 0;
        for (Integer i : c) {
            if (i == 0) {
                count++;
            } else {
                jumps++;
                if (count > 1) {
                    jumps += count / 2;
                   // System.out.println(count);
                }
                count = 0;
            }
        }
        if (count > 1) {
            jumps += count / 2;
            //System.out.println(count);
        }

        System.out.println("All jumps are: " + jumps);

        return jumps;

    }
}
