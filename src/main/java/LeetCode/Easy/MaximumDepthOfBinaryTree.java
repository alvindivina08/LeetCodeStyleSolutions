package LeetCode.Easy;

import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int max = 1;

        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> depth = new Stack<>();

        //push the treenod in node stack
        nodes.push(root);
        //pushed a number in depth stack
        depth.push(1);

        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.pop();
            int depths = depth.pop();

            if (curr.left == null && curr.right == null) {
                max = Math.max(max,depths);
            }

            if (curr.left != null) {
                nodes.push(curr.left);
                depth.push(depths+1);
            }

            if (curr.right != null) {
                nodes.push(curr.right);
                depth.push(depths+1);
            }

        }

        return max;
    }
}
