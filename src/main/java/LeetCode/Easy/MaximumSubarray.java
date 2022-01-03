package LeetCode.Easy;

import java.util.Arrays;

public class MaximumSubarray {
    /* https://leetcode.com/problems/maximum-subarray/
     * Kadane's algorithm solution.
     */

    static int[] numbers = {-1,-2,-3,-20,0,-1,-30,-20,-100,-300};
    public static void main(String[] args){
        System.out.println(Arrays.toString(numbers));
        System.out.println(maxSubArray(numbers));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < n;i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
