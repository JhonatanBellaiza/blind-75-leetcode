package com.problems;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        //Dynamic Programming
        int[] dp = new int[text1.length()];
        int longest = 0;

        for(char c : text2.toCharArray()) {
            int currLength = 0;
            for(int i = 0; i < dp.length; i++) {
                if(currLength < dp[i]) {
                    currLength = dp[i];
                } else if(c == text1.charAt(i)) {
                    dp[i] = currLength + 1;
                    longest = Math.max(longest, currLength + 1);
                }
            }
        }
        return longest;

    }
}
