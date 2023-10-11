package ua.skorobahatyi.tasks_from_hackerrank.arrays;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true
 * Equalize the Array
 */
public class EqualizeTheArray {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 3, 1, 2, 3, 3);
        System.out.println(equalizeArray(list));
        System.out.println(equalizeArray(list2));
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }

        int max= Collections.max( map.values());
        return arr.size()-max;
    }
}
