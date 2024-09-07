package com.problems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
            // //Dividing

            // int[] resp = new int[nums.length];
            // int prod = 1;
            // for(int i : nums) {
            //     prod *= i;
            // }

            // for(int i = 0; i< nums.length; i++) {
            //     resp[i] = prod / nums[i];
            // }

            // return resp;

            int n = nums.length;
            int ans[] = new int[n];
            Arrays.fill(ans, 1);
            int curr = 1;
            for(int i = 0; i < n; i++) {
                ans[i] *= curr;
                curr *= nums[i];
            }
            curr = 1;
            for(int i = n - 1; i >= 0; i--) {
                ans[i] *= curr;
                curr *= nums[i];
            }
            return ans;

//BRUTE FORCEE
            // int[] resp = new int[nums.length];

            // for (int i = 0; i < nums.length; i++) {
            //     int product = 1;

            //     for(int j = 0; j<nums.length; j++) {
            //         if(i != j) {
            //             product *= nums[j];
            //             resp[i] = product;
            //         }
            //     }
            // }
            // return resp;

            // int[] answer = new int[nums.length];
            // int[] rigth = new int[nums.length];
            // int[] left = new int[nums.length];

            // rigth[0] = 1;
            // for(int i = 1; i<nums.length;i++) {
            //     rigth[i] = rigth[i-1]*nums[i-1];
            // }
            // left[nums.length-1] =1;
            // for(int i = nums.length-2; i>=0;i--) {
            //     left[i] = left[i+1]*nums[i+1];
            // }

            // for (int i = 0; i < nums.length; i++) {
            //     answer[i] = left[i] * rigth[i];
            // }

            // return answer;



            // int[] answer = new int[nums.length];
            // int rigthMult = 1;
            // int leftMult = 1;
            // for(int i=0;i<nums.length;i++) {
            //     //rigth
            //     for(int r = i+1; r<nums.length;r++) {
            //         rigthMult *= nums[r];
            //     }
            //     //left
            //     if(i>0) {

            //         for(int l = i-1; l>=0;l--) {
            //             leftMult *= nums[l];
            //         }
            //     }
            //     answer[i] = leftMult*rigthMult;
            //     rigthMult =1;
            //     leftMult = 1;
            // }
            // return answer;

    }
}
