package LeetCode.Easy;

public class ConvertSortedArrayToBST {

    static int[] nums ={-10,-3,0,5,9};

    public static void main(String[] arghs) {
         System.out.println(sortedArrayToBST(nums));
     }
    public static TreeNode sortedArrayToBST(int[] nums) {
        // so we calculate how many elements are in numbs by nums.length-1
        return sortedArrayToBST(nums, 0, nums.length-1);
    }


    public static TreeNode sortedArrayToBST(int[] nums, int lo, int hi){
        if(lo > hi)
            return null;
        //to calculate the mid, we need to subtract hi and low  divide it to 2 and add lo.
        int mid = (hi-lo)/2+lo;
        System.out.println("hi is: "+hi+" lo is: "+lo+" mid is " + mid);
        TreeNode root = new TreeNode(nums[mid]);
        root.left =  sortedArrayToBST(nums, lo, mid-1);
        root.right =  sortedArrayToBST(nums, mid+1, hi);
        return root;
    }
}
