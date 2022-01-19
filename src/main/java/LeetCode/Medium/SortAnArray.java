package LeetCode.Medium;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] arghs){
        int[] nums = {5,-1,1,2,0,-123,-123123,-1234,12412,561,123,5123,5123,15123,1251,23123,4512412,5412321,3124123,14515,123123,15123,1234124512,312412,31231,415,123,14,51,2341,231,231,24,123,1245,123123,12414,2142134,12312,4213412,312312,3123,0,};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {

        if (nums.length == 0) { return nums;}

        QuickSort(nums, 0, nums.length - 1);
        return nums;

    }

    private static void QuickSort(int[] nums, int start, int end) {
        if(start >= end) return;
        int pivot = nums[(start + end)/2];
        int left = start, right = end;

        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }

            while(left <= right && nums[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp;
                temp =  nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        QuickSort(nums,start,right);
        QuickSort(nums,left,end);
    }
}
