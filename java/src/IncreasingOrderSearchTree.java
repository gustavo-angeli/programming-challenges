import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public static void inorder(TreeNode root, List<Integer> values) {
        if (root != null) {
            inorder(root.left, values);
            values.add(root.val);
            inorder(root.right, values);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> val = new ArrayList<>();
        inorder(root, val);
        TreeNode node = new TreeNode(val.get(0));
        TreeNode temp = node;
        for (int i  = 1; i < val.size(); i++) {
            temp.right = new TreeNode(val.get(i));
            temp = temp.right;
        }
        return node;
    }
}
