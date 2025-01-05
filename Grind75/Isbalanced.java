package Grind75;

import Grind75.Trees.BST;

public class Isbalanced {
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

    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }

        TreeNode node = root;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.abs(leftHeight-rightHeight)<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public int height(TreeNode node){
        if (node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }
}
