package ua.skorobahatyi.tasks_from_leetcode.arrays;


import java.util.Arrays;

/**
 * 219. Contains Duplicate II
 * <p>
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicate2_Two {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums1, 3));
        int[] nums2 = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums2, 1));
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums3, 2));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length > 0 && k == 0)
            return false;


        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j <= i + k) {

                if (j >= nums.length)
                    break;
                if (nums[i] == nums[j])
                    return true;

                j++;
            }

        }

        return false;
    }

}
