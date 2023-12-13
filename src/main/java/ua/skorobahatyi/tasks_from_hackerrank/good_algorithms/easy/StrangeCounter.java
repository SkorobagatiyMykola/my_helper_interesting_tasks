package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

public class StrangeCounter {
    public static void main(String[] args) {
        strangeCounter(2);
        strangeCounter(4);
        strangeCounter(8);
        strangeCounter(12);
        strangeCounter(15);
        // strangeCounter(20);
    }

    private static long strangeCounter(long t) {
        // Write your code here
        long z = 3;
        long sum = 3;
        while (t > sum) {
            z *= 2;
            sum += z;

        }
        //System.out.println(t + " - " + sum + " ---- " + k);
        System.out.println( sum-t+1);


        return sum-t+1;
    }
}

