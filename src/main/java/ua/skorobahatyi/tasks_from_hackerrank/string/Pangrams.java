package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * <p>
 * A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
 * <p>
 * Example
 * <p>
 * The string contains all letters in the English alphabet, so return pangram.
 * <p>
 * Function Description
 * <p>
 * Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.
 * <p>
 * pangrams has the following parameter(s):
 * <p>
 * string s: a string to test
 * Returns
 * <p>
 * string: either pangram or not pangram
 * Input Format
 * <p>
 * A single line with string .
 * <p>
 * Sample Input 0
 * <p>
 * We promptly judged antique ivory buckles for the next prize
 * <p>
 * Sample Output 0
 * <p>
 * pangram
 * <p>
 * Sample Explanation 0
 * <p>
 * All of the letters of the alphabet are present in the string.
 * <p>
 * Sample Input 1
 * <p>
 * We promptly judged antique ivory buckles for the prize
 * <p>
 * Sample Output 1
 * <p>
 * not pangram
 * <p>
 * Sample Explanation 0
 * <p>
 * The string lacks an x.
 */
public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    private static String pangrams(String s) {
        // Write your code here
        int ind = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                ind = (s.charAt(i) - 65) % 26;
                arr[ind] = 1;
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ind = (s.charAt(i) - 97) % 26;
                arr[ind] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        return sum == 26 ? "pangram" : "not pangram";

    }
}
