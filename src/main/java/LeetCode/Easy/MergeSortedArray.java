package LeetCode.Easy;

public class MergeSortedArray {
    /* https://leetcode.com/problems/merge-sorted-array/
     * You are given two integer arrays nums1 and nums2,
     * sorted in non-decreasing order,
     * and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m -1, tail2 = n - 1, finished = m + n - 1;

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--];
        }
    }
}
