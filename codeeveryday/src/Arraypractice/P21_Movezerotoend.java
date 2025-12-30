package Arraypractice;

import java.util.Arrays;

public class P21_Movezerotoend {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 4, 0, 5, 7, 0};

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, nonZeroIndex, i);
                nonZeroIndex++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int nonZeroIndex, int i) {
        int temp = nums[nonZeroIndex];
        nums[nonZeroIndex] = nums[i];
        nums[i] = temp;
    }
}