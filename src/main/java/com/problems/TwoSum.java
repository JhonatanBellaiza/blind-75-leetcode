package com.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2];

        // int n = nums.length;
        // for(int i = 0; i<n;i++) {
        //     for(int j = i+1; j<n;j++) {
        //         if( nums[i] + nums[j] == target) {
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }
        // return result;

        Map<Integer, Integer> numMap = new HashMap<>();

        int n = nums.length;

        for(int i =0; i<n; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};

            }
            numMap.put(nums[i],i);
        }

        return new int[] {};
    }

}
