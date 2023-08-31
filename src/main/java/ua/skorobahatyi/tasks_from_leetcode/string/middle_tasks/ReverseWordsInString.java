package ua.skorobahatyi.tasks_from_leetcode.string.middle_tasks;


/**
 * 151. Reverse Words in a String
 * <p>
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * <p>
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 * <p>
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world "));
        System.out.println(reverseWords("a good   example"));
    }

    private static String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            String str = i == 0 ? arr[i] : arr[i] + " ";
            result += str;
        }

        return result;
    }
}
