package ua.skorobahatyi.tasks_from_hackerrank.easy_alg;

/**
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        int[] arr1 = {0, 4};
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        int[] arr3 = {0, 3, 5};

//        System.out.println(flatlandSpaceStations(5, arr1));
//        System.out.println(flatlandSpaceStations(6, arr2));
        System.out.println(flatlandSpaceStations(6, arr3));
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

        return  max==0 ? 0 : (max % 2 == 0 ? max / 2 : max / 2 + 1);
    }
}
