package ua.skorobahatyi.tasks_from_hackerrank.arrays.easy;

import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 1, 3, 2);
        List<Integer> list2 = List.of(2, 2, 1, 3, 2);
        List<Integer> list3 = List.of(1, 1, 1, 1, 1,1);

        System.out.println(birthday(list1, 3, 2));
        System.out.println(birthday(list2, 4, 2));
        System.out.println(birthday(list3, 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        int count = 0;
        int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            if (i >= m) {
                sum -= s.get(i - m);
            }
            if (sum==d&&(i+1) >= m)
                count++;
        }

        return count;
    }
}
