import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        paths(root, paths, currentPath);
        return paths;
    }

    private void paths (TreeNode root, List<String> paths, List<Integer> currentPath) {
        currentPath.add(root.val);
        if (root.left == null && root.right == null) {
            paths.add(pathToString(currentPath));
        }
        if (root.left != null) {
            paths(root.left, paths, currentPath);
        }
        if (root.right != null) {
            paths(root.right, paths, currentPath);
        }
        currentPath.remove(currentPath.size() - 1);
    }
    private String pathToString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        sb.append("" + path.get(0));
        for (int i = 1; i < path.size(); i++) {
            sb.append("->" + path.get(i));
        }
        return sb.toString();
    }
}
