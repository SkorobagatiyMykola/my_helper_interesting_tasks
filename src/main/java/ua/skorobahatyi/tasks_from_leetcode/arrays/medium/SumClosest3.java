package ua.skorobahatyi.tasks_from_leetcode.arrays.medium;

/**
 * 16. 3Sum Closest
 * https://leetcode.com/problems/3sum-closest/description/
 * */
public class SumClosest3 {
    public static void main(String[] args) {

        int[] arr1 = {-1, 2, 1, -4};
        int[] arr2 = {0, 0, 0};
        int[] arr3 = {1, 1, 1,0};

        int target1 = 1;
        int target2 = 1;
        int target3 = -100;

        System.out.println(threeSumClosest(arr1, target1));
        System.out.println(threeSumClosest(arr2, target2));
        System.out.println(threeSumClosest(arr3, target3));
    }

    private static int threeSumClosest(int[] nums, int target) {
        int check = Math.abs(nums[0] + nums[1] + nums[2]-target);
        int sum=nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < check){
                        sum = nums[i] + nums[j] + nums[k];
                        check = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    }

                }
            }
        }

        return sum;
    }
}
