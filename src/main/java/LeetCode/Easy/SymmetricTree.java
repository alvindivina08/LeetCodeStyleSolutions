package LeetCode.Easy;

import java.util.Stack;

public class SymmetricTree {
    /*
     * https://leetcode.com/problems/symmetric-tree/
     * Given the root of a binary tree,
     * check whether it is a mirror of itself
     * (i.e., symmetric around its center).
     */
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left,root.right);
    }

    public boolean isSymmetricHelp(TreeNode left, TreeNode right) {

        // if left is null or right is null
        if (left == null || right == null)
            // we return true if left is the same as the right node
            // else its false
            return left==right;

        //left value is not equals to right value
        //return false
        if (left.val != right.val)
            return false;

        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }

    //stack can hold null!
    public boolean isSymmetricStack(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode n1 = stack.pop(), n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }


    //none recursive
    public boolean isSymmetricNonRecursive(TreeNode root) {
        if(root==null)  return true;

        //created a stack Tree node
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // created an empty object for treenode left and right
        TreeNode left, right;

        if(root.left!=null){
            if(root.right==null) return false;
            stack.push(root.left);
            stack.push(root.right);
        }
        else if(root.right!=null){
            return false;
        }

        //while stack is not empty
        while(!stack.empty()){
            // if stack.size not even. we return false
            if(stack.size()%2!=0)   return false;

            // set right and left as equals to the top of the stack left and stack right.
            // we also remove one element on the top
            right = stack.pop();
            left = stack.pop();
            if(right.val!=left.val) return false;

            if(left.left!=null){
                if(right.right==null)   return false;
                stack.push(left.left);
                stack.push(right.right);
            }
            else if(right.right!=null){
                return false;
            }

            if(left.right!=null){
                if(right.left==null)   return false;
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(right.left!=null){
                return false;
            }
        }

        return true;
    }
}
