package ua.skorobahatyi.tasks_from_leetcode.arrays.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    // Update
    private static int maxArea(int[] height) {
        int max = 0;
        int volumeWater = 0, maxVolumeOfWater=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = height[i] > height[j] ? height[j] : height[i];
                volumeWater = max * (j - i);
                if (volumeWater>maxVolumeOfWater)
                    maxVolumeOfWater=volumeWater;

            }
        }

        return maxVolumeOfWater;
    }
}
