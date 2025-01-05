package Grind75;

import java.util.ArrayList;

public class InOrderTraversal {
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
        public ArrayList<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            helper(root, list);
            return list;
        }

        // Helper method to perform the in-order traversal
        public void helper(TreeNode node, ArrayList<Integer> list) {
            if (node == null) {
                return;
            }
            // Traverse the left subtree
            if (node.left != null) {
                helper(node.left, list);
            }

            // Visit the root node
            list.add(node.val);

            // Traverse the right subtree
            if (node.right != null) {
                helper(node.right, list);
            }
        }
}
