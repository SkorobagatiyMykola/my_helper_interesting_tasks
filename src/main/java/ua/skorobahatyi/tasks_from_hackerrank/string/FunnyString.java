package ua.skorobahatyi.tasks_from_hackerrank.string;


/**
 * https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *
 * 	Submissions	Leaderboard	Discussions	Editorial	Topics
 * In this challenge, you will determine whether a string is funny or not.
 * To determine whether a string is funny, create a copy of the string in reverse e.g. .
 * Iterating through each string, compare the absolute difference in the ascii values
 * of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences
 * is the same for both strings, they are funny.
 *
 * Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
 * */
public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
        System.out.println(funnyString("bcxz"));
    }

    private static String funnyString(String s) {
        // Write your code here
        int len=s.length();
        for (int i = 0; i < s.length()-1; i++) {
            int l1=Math.abs(s.charAt(i)-s.charAt(i+1));
            int l2=Math.abs(s.charAt(len-1-i)-s.charAt(len-1-i-1));
            if (l1!=l2){
                return "Not Funny";
            }
        }

        return "Funny";

    }
}
