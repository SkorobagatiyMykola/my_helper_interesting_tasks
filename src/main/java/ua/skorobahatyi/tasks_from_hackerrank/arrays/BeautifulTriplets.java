package ua.skorobahatyi.tasks_from_hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true
 *Given a sequence of integers , a triplet  is beautiful if:
 *
 * Given an increasing sequenc of integers and the value of , count the number of beautiful triplets in the sequence.
 * */
public class BeautifulTriplets {
    public static void main(String[] args) {
        Integer[] arr={1, 2, 4, 5, 7, 8, 10};

        List<Integer> list = Arrays.asList(arr);

        System.out.println(beautifulTriplets(3, list));

    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(j)-arr.get(i)==d)
                    for (int k = j+1; k < arr.size(); k++) {
                        if ((arr.get(k)-arr.get(j)==d))
                            count++;

                    }
            }

        }

        return count;


    }
}
