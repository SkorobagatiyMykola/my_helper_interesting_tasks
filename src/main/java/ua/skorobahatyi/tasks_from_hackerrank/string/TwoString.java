package ua.skorobahatyi.tasks_from_hackerrank.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Two Strings
 *
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 * https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * */
public class TwoString {
    public static void main(String[] args) {

        System.out.println(twoStrings("and","art"));
        System.out.println(twoStrings("be","cat"));
        System.out.println(twoStrings("hello","world"));
        System.out.println(twoStrings("hi","world"));
    }

    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i)))
                return "YES";
        }

        return "NO";

    }
}
