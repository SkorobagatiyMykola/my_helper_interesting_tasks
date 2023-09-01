package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * HackerRank in a String!
 *
 *  https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *
 *  We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.
 *
 * More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.
 *
 * For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.
 *
 * Example
 *
 * This contains a subsequence of all of the characters in the proper order. Answer YES
 *
 *
 * This is missing the second 'r'. Answer NO.
 *
 *
 * There is no 'c' after the first occurrence of an 'a', so answer NO.
 *
 * Function Description
 *
 * Complete the hackerrankInString function in the editor below.
 *
 * hackerrankInString has the following parameter(s):
 *
 * string s: a string
 * Returns
 *
 * string: YES or NO
 * Input Format
 *
 * The first line contains an integer , the number of queries.
 * Each of the next  lines contains a single query string .
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 2
 * hereiamstackerrank
 * hackerworld
 * Sample Output 0
 *
 * YES
 * NO
 * */
public class HackerRankString {

    private static String TEMPLATE = "hackerrank";
    public static void main(String[] args) {

        System.out.println(hackerrankInString("hereiamstackerrank"));
        System.out.println(hackerrankInString("hackerworld"));
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }

    private static String hackerrankInString(String s) {
        // Write your code here

        int index=0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==TEMPLATE.charAt(index)){
                if (++index==TEMPLATE.length())
                    return "YES";
            }

        }


        return "NO";
    }
}
