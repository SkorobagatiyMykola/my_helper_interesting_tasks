package ua.skorobahatyi.tasks_from_hackerrank.easy_alg;

import java.util.*;

/**
 *
 *  https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * */
public class MaximumElement {

    public static void main(String[] args) {

    }

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        // List

        //List<Integer> list = new LinkedList<>();
       Stack<Integer> list = new Stack<>();

        for (int i = 0; i <operations.size() ; i++) {
            String[] arr = operations.get(i).split(" ");
            if (arr[0].equals("1")) {
                list.push(Integer.valueOf(arr[1]));
            } else if (arr[0].equals("2")) {
                list.pop();
            } else if (arr[0].equals("3")) {
                System.out.println(Collections.max(list));
            }

        }

        return list;
    }
}
