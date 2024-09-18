package com.problems;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int rigth = n-1;
        int mid = 0;
        while(left<=rigth) {
            mid = (left+rigth)/2;
            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid]>=nums[left]) {
                if(nums[left]<=target && target<=nums[mid]) {
                    rigth = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(nums[mid]<=target && target<=nums[rigth]){
                    left = mid+1;
                }else {
                    rigth = mid-1;
                }
            }

        }
        return -1;
    }
}
