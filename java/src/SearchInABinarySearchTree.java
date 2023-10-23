import DataStructures.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int value) {
        while (root != null && root.val != value) {
            if (root.left != null && root.val > value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}
