package easy;

public class _572  {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (check(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public boolean check(TreeNode root, TreeNode subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root != null && subroot == null ) {
            return false;
        }

        if (root == null) {
            return false;
        }

        if (root.val != subroot.val) {
            return false;
        }

        return check(root.left, subroot.left) && check(root.right, subroot.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
