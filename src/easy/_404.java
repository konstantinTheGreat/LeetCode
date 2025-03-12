package easy;

import utils.TreeNode;

public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int var;

        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                var = root.left.val;
                return sumOfLeftLeaves(root.right) + var;
            }
        }

        return left + right;

    }
}

/*Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.*/