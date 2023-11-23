package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
 */
public class StrongPassword {
    private static final int MIN_SYMBOLS = 6;

    public static void main(String[] args) {
        // System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(11, "#HackerRank"));
        // System.out.println(minimumNumber(5, "2bbbb"));
        //System.out.println(minimumNumber(10, "1234567890"));
        System.out.println(minimumNumber(10, "ОООООООООО"));

    }

    private static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        if (n < MIN_SYMBOLS)
            count = MIN_SYMBOLS - n;

        int count_change = 0;

        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = true;
        boolean cond4 = true;
        for (int i = 0; i < password.length(); i++) {
            int indx=password.charAt(i);
            if (indx>=48&&indx<=57)
                cond1=false;
            if (indx>=65&&indx<=90)
                cond2=false;
            if (indx>=97&&indx<=122)
                cond3=false;
            if (indx==33||indx==64||indx==35||indx==35||indx==37||indx==94||indx==38||indx==42||indx==40
                    ||indx==41||indx==43||indx==45||indx==32)
                cond4=false;

        }

        count_change = cond1 ? ++count_change : count_change;
        count_change = cond2 ? ++count_change : count_change;
        count_change = cond3 ? ++count_change : count_change;
        count_change = cond4 ? ++count_change : count_change;

        /*
        Pattern pattern2 = Pattern.compile("[0-9]");
        Matcher matcher2 = pattern2.matcher(password);
        if (!matcher2.find())
            count_change++;

        Pattern pattern3 = Pattern.compile("[a-z]");
        Matcher matcher3 = pattern3.matcher(password);
        if (!matcher3.find())
            count_change++;


        Pattern pattern4 = Pattern.compile("[A-Z]");
        Matcher matcher4 = pattern4.matcher(password);
        if (!matcher4.find())
            count_change++;

        Pattern pattern5 = Pattern.compile("[!@#$%^&*()-+]");
        Matcher matcher5 = pattern5.matcher(password);
        if (!matcher5.find())
            count_change++;*/

        return count_change > count ? count_change : count;

    }
}
