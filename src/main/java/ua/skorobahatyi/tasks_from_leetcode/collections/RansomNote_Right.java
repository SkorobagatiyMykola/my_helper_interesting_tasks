package ua.skorobahatyi.tasks_from_leetcode.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * Example 1:
 * <p>
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * <p>
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * <p>
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote_Right {
    public static void main(String[] args) {
//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
      //  System.out.println(canConstruct("aa", "aab"));
        //System.out.println(canConstruct("aab", "baa"));
        System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = magazine.toCharArray();
        Arrays.sort(arr);
        magazine = new String(arr);

        Map<String, Integer> mapMagazine = new HashMap<>();
        int length = ransomNote.length();

        Integer id = 0;
        for (int i = 0; i < magazine.length() - length + 1; i++) {

            String str = magazine.substring(i, i + length);

            mapMagazine.put(str, i);
        }

        arr = ransomNote.toCharArray();
        Arrays.sort(arr);
        ransomNote = new String(arr);

        if (mapMagazine.containsKey(ransomNote))
            return true;
        else
            return false;

    }
}
