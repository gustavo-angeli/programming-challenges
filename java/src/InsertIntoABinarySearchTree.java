import DataStructures.TreeNode;

public class InsertIntoABinarySearchTree {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            }
            insertIntoBST(root.left, val);
        } else if (val > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            }
            insertIntoBST(root.right, val);
        }
        return root;
    }
}
