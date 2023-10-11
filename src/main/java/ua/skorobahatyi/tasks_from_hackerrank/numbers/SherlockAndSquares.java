package ua.skorobahatyi.tasks_from_hackerrank.numbers;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
 * Sherlock and Squares
 */
public class SherlockAndSquares {
    public static void main(String[] args) {

        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
    }

    public static int squares(int a, int b) {
        // Write your code here
        int min = (int) Math.sqrt(a);
        int max = (int) Math.sqrt(b);
       // System.out.println(min+"  -   "+max);
        min = min * min == a ? min - 1 : min;
        //max = max * max == b ? max + 1 : max;

        return max-min;
    }

}
