package com.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        if( nums == null || nums.length == 0) {
            return 0;
        }

        // Dynamic programming solution
        // int length = nums.length;
        // int [] dp = new int[length];
        // Arrays.fill(dp, 1);
        // for(int i = 0; i<length; ++i) {
        //     for(int j = 0; j< i; ++j) {
        //         if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
        //             dp[i] = dp[j] + 1;
        //         }
        //     }
        // }
        // return Arrays.stream(dp).max().orElse(0);

        // O(n log(n)) Solution

        int n = nums.length;
        List<Integer> sub = new ArrayList<>();
        for(int x : nums) {
            if(sub.isEmpty() || sub.get(sub.size()-1) < x) {
                sub.add(x);
            } else {
                int left = 0;
                int right = sub.size();
                while(left<right) {
                    int mid = left + (right - left)/2;
                    if(sub.get(mid) < x) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                sub.set(left, x);
            }
        }
        return sub.size();
    }
}
