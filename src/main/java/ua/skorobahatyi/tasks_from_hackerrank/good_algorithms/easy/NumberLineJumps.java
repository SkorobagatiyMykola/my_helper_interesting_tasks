package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

public class NumberLineJumps {

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (v2>=v1) {
            return "NO";
        } else {
            while(x1<x2){
                x1+=v1;
                x2+=v2;
            }
            return x1==x2 ? "YES" : "NO";
        }

    }
}
