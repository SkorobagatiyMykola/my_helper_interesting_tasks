package ua.skorobahatyi.tasks_from_hackerrank.string;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * <p>
 * There is a collection of rocks where each rock has various minerals embeded in it.
 * Each type of mineral is designated by a lowercase letter in the range .
 * There may be multiple occurrences of a mineral in a rock.
 * A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.
 * <p>
 * Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.
 * <p>
 * Example
 * <p>
 * The minerals  and  appear in each rock, so there are  gemstones.
 */
public class Gemstones {
    public static void main(String[] args) {

        List<String> list1 = List.of("abcdde", "baccd", "eeabg");
        List<String> list2 = List.of("abc", "abc", "bc");
        System.out.println(gemstones(list1));
        System.out.println(gemstones(list2));
    }

    public static int gemstones(List<String> arr) {
        // Write your code here
        Map<Character, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            for (int j = 0; j < str.length(); j++) {
                Character character = str.charAt(j);
                Set<Integer> set = map.getOrDefault(character, new HashSet<>());
                set.add(i);
                map.put(character, set);
            }
        }

        int count=0;
        for (Character ch : map.keySet()) {
            if (arr.size()==map.get(ch).size())
                count++;
        }

        return count;
    }

}
