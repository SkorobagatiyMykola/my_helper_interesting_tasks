package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
 *
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:
 *
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , determine the number of words in .
 * */

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    private static int camelcase(String s) {
        // Write your code here
        if (s.isEmpty())
            return 0;

        int count=1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)<95)
                count++;
        }
        return count;
    }
}
