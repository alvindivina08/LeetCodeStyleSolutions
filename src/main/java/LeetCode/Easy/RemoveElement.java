package LeetCode.Easy;

public class RemoveElement {
    /* https://leetcode.com/problems/remove-element/
     *
     * Given an integer array nums and an integer val,
     * remove all occurrences of val in nums in-place.
     * The relative order of the elements may be changed.
     */

    public int removeElement(int[] nums, int val) {
        if (nums == null) return 0;
        int l = 0;

        for (int i = 0; i < nums.length ; i++){
            if (nums[i] != val) {
                nums[l] = nums[i];
                l++;
            }
        }

        return l;
    }
}
