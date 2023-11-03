package ua.skorobahatyi.tasks_from_hackerrank.arrays;

import java.util.*;

/**
 * Picking Numbers
 * https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Integer[] arr1 = {4, 6, 5, 3, 3, 1};
        Integer[] arr2 = {1, 1, 2, 2, 4, 4, 5, 5, 5};

        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        System.out.println(pickingNumbers(list1));
        System.out.println(pickingNumbers(list2));
    }

    private static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);

        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (a.get(j) - a.get(i) <= 1) {
                    count++;
                    if (j==a.size()-1){
                        max = max > count ? max : count;
                    }
                } else {
                    i = --j;
                    max = max > count ? max : count;
                    break;
                }
            }
        }

//        for (Integer i:a) {
//            System.out.print(i+" ");
//        }
//        System.out.println();

        //System.out.println(max);


        return max;

    }
}
