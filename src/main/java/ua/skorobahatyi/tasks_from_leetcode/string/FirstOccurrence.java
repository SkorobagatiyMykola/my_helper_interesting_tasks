package ua.skorobahatyi.tasks_from_leetcode.string;

/**
 * 28. Find the Index of the First Occurrence in a String
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurrence {

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","leeto"));
    }

    private static int strStr(String haystack, String needle) {

        int len = needle.length();
        String compare="";
        for (int i = 0; i < haystack.length()-len+1; i++) {
            compare=haystack.substring(i,i+len);

            if (compare.equals(needle))
                return i;

        }

        return -1;
    }
}
