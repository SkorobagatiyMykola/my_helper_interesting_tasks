package ua.skorobahatyi.tasks_from_leetcode.arrays;

/**
 * 605. Can Place Flowers
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1};
        int[] arr2 = {1, 0, 0, 0, 0, 0, 1};
        int[] arr3 = {1, 0, 0, 0, 1, 0, 0};
        //System.out.println(canPlaceFlowers(arr1,1));
        //System.out.println(canPlaceFlowers(arr2,2));
        System.out.println(canPlaceFlowers(arr3, 2));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int countEmpty = 0;
        if (flowerbed.length==1&&n==1&&flowerbed[0]==0)
            return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                countEmpty++;
                if (i == 0){
                    countEmpty++;
                } else if (i == flowerbed.length - 1) {
                    countEmpty++;
                    if (countEmpty % 2 == 0) {
                        count += countEmpty / 2 - 1;
                    } else {
                        count += countEmpty / 2;
                    }
                }
            } else {
                if (countEmpty > 0) {
                    if (countEmpty % 2 == 0) {
                        count += countEmpty / 2 - 1;
                    } else {
                        count += countEmpty / 2;
                    }
                    countEmpty = 0;
                }
            }
            if (count >= n)
                return true;
        }
        return false;
    }
}
