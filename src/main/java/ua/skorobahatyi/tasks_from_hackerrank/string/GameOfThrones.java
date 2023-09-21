package ua.skorobahatyi.tasks_from_hackerrank.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Game of Thrones - I
 * https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class GameOfThrones {
    public static void main(String[] args) {
        System.out.println(gameOfThrones("aaabbbb"));
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));

    }

    private static String gameOfThrones(String s) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (map.get(character) == null) {
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }

        int countOdd = 0;
        for (Character ch : map.keySet()) {
            if (map.get(ch) % 2 == 1)
                countOdd++;
        }

        return countOdd > 1 ? "NO" : "YES";
    }
}
