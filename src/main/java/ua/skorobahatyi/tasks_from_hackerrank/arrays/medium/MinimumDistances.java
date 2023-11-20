package ua.skorobahatyi.tasks_from_hackerrank.arrays.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true
 */
public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(7, 1, 3, 5, 19, 4, 15, 18, 1);
        //List<Integer> list2 = List.of(3, 2, 1, 2, 3);
        //List<Integer> list2 = List.of(3, 3, 3, 3, 3);
        //List<Integer> list2 = List.of(1, 2, 3, 4, 5,44,14,1);
        List<Integer> list2 = List.of(1, 1, 2);
        System.out.println(minimumDistances(list1));
        System.out.println(minimumDistances(list2));
    }


    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        int dist = a.size();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                if (dist > i - map.get(a.get(i))) {
                    dist = i - map.get(a.get(i));
                    map.put(a.get(i), i);
                }
            } else {
                map.put(a.get(i), i);
            }
        }

        return dist < a.size() ? dist : -1;
    }

    public static int minimumDistances2(List<Integer> a) {
        // Write your code here
        //Map<Integer,List<Integer>> map = new HashMap<>();


        for (int i = 1; i < a.size(); i++) {
            for (int j = 0; j < a.size() - i; j++) {
                if (a.get(j) == a.get(j + i)) {
                    return i;
                }
            }
        }

        return -1;
    }

    /*
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        //Map<Integer,List<Integer>> map = new HashMap<>();

        int dist = a.size();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                //System.out.println("Compare :" +i+"  "+j);

                if (a.get(i) == a.get(j)) {
                    if (dist > j - i) {
                        dist = j - i;
                    }
                }
            }
        }

        return dist < a.size() ? dist : -1;
    }*/
}
