package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 * https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true
 */
public class LibraryFine {

    public static void main(String[] args) {
        System.out.println(libraryFine(14, 7, 2018, 5, 7, 2018));
    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        if (y2 < y1) {
            return 10000;
        } else if (y2 == y1) {
            if (m2 < m1) {
                return 500 * (m1 - m2);
            } else if (m2 == m1) {
                if (d2 < d1) {
                    return 15 * (d1 - d2);
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }
}
