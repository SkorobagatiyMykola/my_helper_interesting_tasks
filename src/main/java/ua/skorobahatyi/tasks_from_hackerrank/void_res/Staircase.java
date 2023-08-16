package ua.skorobahatyi.tasks_from_hackerrank.void_res;


/**
 * Staircase
 * https://www.hackerrank.com/challenges/staircase/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Staircase detail
 * <p>
 * This is a staircase of size :
 * <p>
 * #
 * ##
 * ###
 * ####
 * Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 * <p>
 * Write a program that prints a staircase of size .
 * <p>
 * Function Description
 * <p>
 * Complete the staircase function in the editor below.
 * <p>
 * staircase has the following parameter(s):
 * <p>
 * int n: an integer
 */
public class Staircase {
    public static void main(String[] args) {
        staircase(8);
    }

    private static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();

        }

    }
}
