package com.problems;

public class FindMinimumRotatedSortedArray {
    public int findMin(int[] nums) {
        // O(n) COMPLEXITY
        // int n = nums.length;
        // int curr = nums[0];
        // int target = nums[0];


        // for(int i = 1; i < n; i++) {
        //     if(nums[i]<curr) {
        //         curr = nums[i];
        //         target = Math.min(target, curr);
        //     }
        // }
        // return target;

        // 0(log n) Complexity
        int n = nums.length;
        int left = 0;
        int rigth = n-1;
        int mid = 0;
        int target = nums[left];
        while(left<=rigth) {
            mid = (left + rigth)/2;
            if(nums[mid] < target) {
                target = nums[mid];
            } else if (nums[left] < nums[mid]) {
                //left sorted
                if(nums[mid] < nums[rigth]) {
                    rigth = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(nums[mid] < nums[rigth]) {
                    rigth = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }

        return target;
    }
}
