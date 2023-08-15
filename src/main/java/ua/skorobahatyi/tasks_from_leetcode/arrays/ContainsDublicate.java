package ua.skorobahatyi.tasks_from_leetcode.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */


public class ContainsDublicate {
    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4,1};
        int[] nums2 = {7, 6, 5, 4, 3, 1,5};
        int[] nums3 = {1, 2, 3, 4};

        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }


    private static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] - nums[i + 1] == 0)
                return true;
        }

        return false;
    }
}
