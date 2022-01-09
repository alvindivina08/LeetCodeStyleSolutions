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
        // n is now equals to the length of array in nums
        int n = nums.length;
        //setting object dp as an element with the limit of
        //the length of the array
        int[] dp = new int[n];
        // we set the first element in dp as equals to
        // the first element in nums array
        dp[0] = nums[0];
        // max integer is now set to the first element in dp
        int max = dp[0];

        //traverse from the second element in nums up to the last element
        for (int i = 1; i < n;i++) {

            // is previous element  in dp greater than 0?
            //if yes, we add the previous element in dp as the current dp
            // else we set it back to 0
            //
            // we set the current dp as equals to the current nums plus the above statement.
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            //we set max as the greatest number between max and the current dp
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
