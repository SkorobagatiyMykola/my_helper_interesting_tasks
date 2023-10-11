package ua.skorobahatyi.tasks_from_hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 3, 1, 2, 3, 3);
        System.out.println(cutTheSticks(list));
        System.out.println(cutTheSticks(list2));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        while (arr.size() > 0) {
            list.add(arr.size());
            int min = Collections.min(arr);
            List<Integer> listNew = new ArrayList<>();
            for (Integer z : arr) {
                if (z - min > 0)
                    listNew.add(z - min);
            }
            arr = listNew;
        }

        return list;

    }

}
