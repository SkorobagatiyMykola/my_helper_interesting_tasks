package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

/**
 *https://www.hackerrank.com/challenges/lowest-triangle/problem?isFullScreen=true
 *
 *Minimum Height Triangle
 * */
public class MinimumHeightTriangle {
    public static void main(String[] args) {
        System.out.println(lowestTriangle(4,6));
    }


    public static int lowestTriangle(int trianglebase, int area) {
        // Write your code here
        return 2*area%trianglebase==0 ? 2*area/trianglebase:2*area/trianglebase+1;
    }
}
