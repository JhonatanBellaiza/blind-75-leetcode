package com.problems;

public class MaximunSubArray {
    public int maxSubArray(int[] nums) {
        int currentIndexSum = nums[0];
        int overAllMaxSum= nums[0];

        for(int i=1;i<nums.length;i++) {
            currentIndexSum = Math.max(nums[i], currentIndexSum + nums[i]);
            overAllMaxSum = Math.max(overAllMaxSum, currentIndexSum);
        }
        return overAllMaxSum;

    }
}
