package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        System.out.println(icecreamParlor(4, List.of(1, 4, 5, 3, 2)));
        System.out.println(icecreamParlor(4, List.of(2, 2, 4, 3)));
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>=m)
                continue;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    List<Integer> res = new ArrayList<>();
                    res.add(i + 1);
                    res.add(j + 1);
                    return res;
                }
            }
        }

        return null;
    }
}
