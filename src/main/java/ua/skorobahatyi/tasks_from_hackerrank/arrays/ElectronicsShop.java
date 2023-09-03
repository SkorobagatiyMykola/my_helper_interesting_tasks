package ua.skorobahatyi.tasks_from_hackerrank.arrays;

public class ElectronicsShop {
    public static void main(String[] args) {
        int b1 = 10;
        int[] keyboards1 = {3, 1};
        int[] drives1 = {5, 2, 8};

        int b2 = 5;
        int[] keyboards2 = {4};
        int[] drives2 = {5};

        System.out.println(getMoneySpent(keyboards1,drives1,b1));
        System.out.println(getMoneySpent(keyboards2,drives2,b2));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int sum=-1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i]+drives[j]<=b&&(keyboards[i]+drives[j]>sum)))
                    sum=keyboards[i]+drives[j];
            }

        }

        return sum;

    }
}
