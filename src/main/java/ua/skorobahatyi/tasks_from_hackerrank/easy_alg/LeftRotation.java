package ua.skorobahatyi.tasks_from_hackerrank.easy_alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> res1 = rotateLeft(2, list1);
        List<Integer> res2 = rotateLeft(4, list1);

        System.out.println(res1);
        System.out.println(res2);
    }

    private static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int size = arr.size();

        int step = d % size;
        List<Integer> result = new ArrayList<>();

        int ind = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (step + i >= size) {
                ind = (step + i) -size;
            } else {
                ind = step + i;
            }
            result.add(arr.get(ind));

        }

        return result;

    }
}
