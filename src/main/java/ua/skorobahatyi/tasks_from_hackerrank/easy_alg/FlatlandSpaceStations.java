package ua.skorobahatyi.tasks_from_hackerrank.easy_alg;

/**
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        int[] arr1 = {0, 4};
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        int[] arr3 = {0, 3, 5};
        int[] arr4 = {7};

//        System.out.println(flatlandSpaceStations(5, arr1));
//        System.out.println(flatlandSpaceStations(6, arr2));
        System.out.println(flatlandSpaceStations(6, arr3));
        System.out.println(flatlandSpaceStations(10, arr4));
    }

    private static int flatlandSpaceStations(int n, int[] c) {
        int arr[] = new int[n];
        for (int i = 0; i < c.length; i++) {
            arr[c[i]] = 1;
        }
        int max = 0;

        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z++;
            } else {
                if (z > max)
                    max = z;
                z = 0;
            }
        }

        int maxFirst = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                maxFirst++;
            } else {
                break;
            }
        }

        int maxLast = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                maxLast++;
            } else {
                break;
            }
        }

        int max1 = maxFirst > maxLast ? maxFirst : maxLast;
        int max2 = max == 0 ? 0 : (max % 2 == 0 ? max / 2 : max / 2 + 1);

        return max1> max2 ? max1 : max2;
    }
}
