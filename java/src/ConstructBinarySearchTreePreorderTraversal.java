import DataStructures.TreeNode;

public class ConstructBinarySearchTreePreorderTraversal {
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode temp = root;
        for (int i  = 1; i < preorder.length; i++) {
            System.out.println(i);
            temp = insertIntoBST(temp, i);
        }
        return root;
    }
}
