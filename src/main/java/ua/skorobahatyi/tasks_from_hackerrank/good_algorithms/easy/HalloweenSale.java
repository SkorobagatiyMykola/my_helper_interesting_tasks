package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

public class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
        // System.out.println(howManyGames(20, 3, 6, 70));
    }

    private static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        int sum = 0;
        while (s > sum) {
            sum += p;
            if(sum>s)
                break;
            count++;
            p = p - d > m ? p - d : m;

        }

        return count;
    }
}
