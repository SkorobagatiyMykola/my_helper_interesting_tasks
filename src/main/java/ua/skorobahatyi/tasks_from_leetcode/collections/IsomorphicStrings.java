package ua.skorobahatyi.tasks_from_leetcode.collections;


import java.util.HashMap;
import java.util.Map;

/**
 * Isomorphic Strings
 * https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicStrings {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<String, String> mapS = new HashMap<>();
        Map<String, String> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            String t1 = String.valueOf(t.charAt(i));

            mapS.putIfAbsent(s1, t1);
            mapT.putIfAbsent(t1, s1);

            if (!mapS.get(s1).equals(t1) || !mapT.get(t1).equals(s1))
                return false;
        }


        return true;
    }
}
