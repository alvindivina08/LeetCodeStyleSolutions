package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;



    /*
     * https://leetcode.com/problems/same-tree/
     * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     */

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();

        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        if(p !=null && q !=null){
            queue.offer(p);
            queue.offer(q);
        }

        while(!queue.isEmpty()) {

            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            if (first == null && second == null)
                return true;
            if (first == null || second == null)
                return false;
            if (first.val != second.val)
                return false;

            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);
        }

        return true;
    }

    public boolean isSameTrees(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTrees(p.left,q.left) &&
                isSameTrees(p.right,q.right);
    }

}


