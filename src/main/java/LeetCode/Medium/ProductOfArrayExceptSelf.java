package LeetCode.Medium;

public class ProductOfArrayExceptSelf {

//    https://leetcode.com/problems/product-of-array-except-self/
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        // Calculate lefts and store in res.
        for (int i = 1 ; i < n ; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n-1; i >= 0 ; i--){
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
}
