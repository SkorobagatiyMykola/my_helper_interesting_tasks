package ua.skorobahatyi.tasks_from_leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr1 = {"flower", "flow", "flight"};
        String[] arr2 = {"dog", "racecar", "car"};
        String[] arr3 = {"dog"};
        System.out.println(longestCommonPrefix(arr1)); // output fl
        System.out.println(longestCommonPrefix(arr2)); // output ""
        System.out.println(longestCommonPrefix(arr3)); // output dog
    }

    private static String longestCommonPrefix(String[] strs) {
        /*int length = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < length)
                length = strs[i].length();
        }*/
        //int length = Arrays.stream(strs).mapToInt(el->el.length()).min().orElseThrow();


        String s = "";
        int ind = 0;
        //for (int i = 0; i < length; i++) {
        while (true) {
            try {
                for (int j = 0; j < strs.length - 1; j++) {
                    if (strs[j].charAt(ind) != strs[j + 1].charAt(ind)) {
                        return s;
                    }
                }
                s = s + strs[0].charAt(ind);
                ind++;
            } catch (Exception ex){
                break;
            }
        }
        //}

        return s;
    }
}
