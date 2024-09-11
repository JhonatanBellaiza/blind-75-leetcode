package com.problems;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        int overAllMaxProd = nums[0];
        int currentMaxProd = nums[0];

        for(int i = 1; i < nums.length;i++) {
            currentMaxProd = Math.max(nums[i], currentMaxProd*nums[i] );
            overAllMaxProd = Math.max(overAllMaxProd, currentMaxProd);
        }
        return overAllMaxProd;
    }

}
