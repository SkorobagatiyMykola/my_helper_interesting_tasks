package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
 * Append and Delete
 */
public class AppendAndDelete {

    public static void main(String[] args) {

        //System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("abc", "def", 6));
        System.out.println(appendAndDelete("abbbb", "abbbbz",6 ));
        //System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        //System.out.println(appendAndDelete("ashley", "ash", 2));
    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        String min, max;
        if (s.length() > t.length()) {
            min = t;
            max = s;
        } else {
            min = s;
            max = t;
        }

        int count = 0;
        for (int i = 0; i < min.length(); i++) {
            if (min.charAt(i) == max.charAt(i)) {
                count++;
            } else {
                break;
            }
        }

        int minStep=s.length() + t.length() - 2*count;

        if (k == minStep)
            return "Yes";
        else if (k>=s.length() + t.length())
            return "Yes";
        else   if (k > minStep && k < s.length() + t.length()&&
                (k-minStep)%2==0)
            return "Yes";
        else
            return "No";

        //return k >= s.length() + t.length() - 2*count ? "Yes" : "No";
    }
}
