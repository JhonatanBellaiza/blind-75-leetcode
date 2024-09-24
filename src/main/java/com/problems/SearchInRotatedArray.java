package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsValue(target)) {
                return map.get(target);
            }
            map.put(nums[i], i);
        }
        return -1;
//        int n = nums.length;
//        int left = 0;
//        int rigth = n-1;
//        int mid = 0;
//        while(left<=rigth) {
//            mid = (left+rigth)/2;
//            if(nums[mid] == target) {
//                return mid;
//            }
//
//            if(nums[mid]>=nums[left]) {
//                if(nums[left]<=target && target<=nums[mid]) {
//                    rigth = mid-1;
//                } else {
//                    left = mid+1;
//                }
//            } else {
//                if(nums[mid]<=target && target<=nums[rigth]){
//                    left = mid+1;
//                }else {
//                    rigth = mid-1;
//                }
//            }
//
//        }
//        return -1;
    }
}
