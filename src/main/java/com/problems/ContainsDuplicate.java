package com.problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> values = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length ; i++) {
           if(values.containsKey(nums[i])) {
               return true;
           }
           values.put(nums[i], i);
        }
        return false;
    }
}
