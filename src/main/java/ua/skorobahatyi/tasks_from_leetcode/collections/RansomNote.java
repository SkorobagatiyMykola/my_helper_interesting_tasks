package ua.skorobahatyi.tasks_from_leetcode.collections;

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
public class RansomNote {
    public static void main(String[] args) {
//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
//        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {

        Map<Integer, Integer> mapMagazine = new HashMap<>();

        Integer id = 0;
        for (int i = 0; i < magazine.length(); i++) {
            id = Integer.valueOf(magazine.charAt(i));
            if (mapMagazine.get(id) == null) {
                mapMagazine.put(id, 1);
            } else {
                mapMagazine.put(id, mapMagazine.get(id) + 1);
            }
        }

        Map<Integer, Integer> mapRansomNote = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            id = Integer.valueOf(ransomNote.charAt(i));
            if (mapRansomNote.get(id) == null) {
                mapRansomNote.put(id, 1);
            } else {
                mapRansomNote.put(id, mapRansomNote.get(id) + 1);
            }
        }


        for (Integer key : mapRansomNote.keySet()) {
            if (mapMagazine.get(key)==null||mapRansomNote.get(key)>mapMagazine.get(key))
                return false;
        }

        return true;
    }
}
