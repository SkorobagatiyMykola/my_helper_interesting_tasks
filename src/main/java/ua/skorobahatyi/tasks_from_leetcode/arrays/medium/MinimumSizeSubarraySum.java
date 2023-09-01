package ua.skorobahatyi.tasks_from_leetcode.arrays.medium;

import java.util.Arrays;

/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray  *  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 * <p>
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * <p>
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 104
 * <p>
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
 */
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int[] nums2 = {1, 4, 4};
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] nums4 = {12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int[] nums5 = {8};

        int[] nums7 = {4, 4, 4};
//        System.out.println(minSubArrayLen(7,nums1));
//        System.out.println(minSubArrayLen(4,nums2));
//        System.out.println(minSubArrayLen(11,nums3));
        //System.out.println(minSubArrayLen(213, nums4));


        System.out.println(minSubArrayLenImproves(7, nums1));
        System.out.println(minSubArrayLenImproves(4, nums2));
        System.out.println(minSubArrayLenImproves(11, nums3));
        System.out.println(minSubArrayLenImproves(120, nums7));
        System.out.println(minSubArrayLenImproves(12, nums7));
        System.out.println(minSubArrayLenImproves(213, nums4));

//        System.out.println(minSubArrayLenImproves(4, nums2));
//        System.out.println(minSubArrayLenImproves(11, nums3));
        // System.out.println(minSubArrayLenImproves(21, nums4));
        //System.out.println(minSubArrayLen(7, nums5));
        //System.out.println(minSubArrayLenImproves(7, nums5));
    }

    private static int minSubArrayLen(int target, int[] nums) {
//        if (nums.length==1&&nums[0]>=target)
//            return 1;
//        if (nums.length==1&&nums[0]<target)
//            return 0;

        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }

        if (sum < target) {
            return 0;
        } else if (min == max)
            return target / min + (target % min != 0 ? 1 : 0);

        int length = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target && length > j - i + 1) {
                    length = j - i + 1;
                    break;
                }

            }
        }

        return length != nums.length + 1 ? length : 0;
    }


    private static int minSubArrayLenImproves(int target, int[] nums) {


        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }

        if (sum < target) {
            return 0;
        } else if (min == max)
            return target / min + (target % min != 0 ? 1 : 0);


        min = 0;
        max = nums.length;
        int median = (max + min) / 2 + ((max + min) % 2 == 1 ? 1 : 0);

        int count = 0;
        boolean check = true;

        while (check) {
            sum = 0;
            int sumMax = 0;

            for (int i = 0; i < nums.length - median + 1; i++) {
                sum = 0;
                for (int j = i; j < i + median && j < nums.length; j++) {
                    sum += nums[j];
                }
                sumMax = sumMax > sum ? sumMax : sum;
            }

            if (sumMax >= target) {
                if (max == median)
                    check = false;

                max = median;
                count = max;
                median = (max + min) / 2 + ((max + min) % 2 == 1 ? 1 : 0);
            } else {
                if (min == median)
                    check = false;
                min = median;
                median = (max + min) / 2 + ((max + min) % 2 == 1 ? 1 : 0);
            }

        }
        return count;
    }

    private static int minSubArrayLenHint(int target, int[] nums) {

        Arrays.sort(nums);
        for (int values : nums) {
            System.out.print(values + ", ");
            // 10, 8, 5, 2, 1,
        }

        System.out.println();
        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if (sum >= target) {
                System.out.println(sum + "  -  " + i);
                return nums.length - i;
            }
        }

        return 0;
    }
}
