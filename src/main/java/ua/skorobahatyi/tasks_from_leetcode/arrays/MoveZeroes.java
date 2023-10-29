package ua.skorobahatyi.tasks_from_leetcode.arrays;

/**
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/description/
 * */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int[] arr = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]!=0)
                arr[k++]=nums[i];

        }

        for(int i=0;i<arr.length;i++) {
            nums[i]=arr[i];
        }



    }
}
