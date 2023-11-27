import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BstToGst {
    public static void inorder(TreeNode root, List<Integer> values) {
        if (root != null) {
            inorder(root.left, values);
            values.add(root.val);
            inorder(root.right, values);
        }
    }
    public static void inorders(TreeNode root, Map<Integer, Integer> newValues) {
        if (root != null) {
            inorders(root.left, newValues);
            root.val = newValues.get(root.val);
            inorders(root.right, newValues);
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        Map<Integer, Integer> values = new HashMap<>();
        List<Integer> nodeValues = new ArrayList<>();

        inorder(root, nodeValues);

        for (int i = 0; i < nodeValues.size() - 1; i++) {
            int sum = nodeValues.get(i);
            for (int j = i+1; j < nodeValues.size(); j++) {
                sum += nodeValues.get(j);
            }
            values.put(nodeValues.get(i), sum);
        }
        values.put(nodeValues.get(nodeValues.size() - 1), nodeValues.get(nodeValues.size() - 1));

        inorders(root, values);

        return root;
    }
}
