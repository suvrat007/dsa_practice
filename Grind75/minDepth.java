package Grind75;

public class minDepth {
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
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return helper(root);
    }
    public int helper(TreeNode node){
        if (node == null){
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1; // If it's a leaf node, the depth is 1
        }

        if (node.left == null) {
            return 1 + helper(node.right);
        }
        if (node.right == null) {
            return 1 + helper(node.left);
        }
        return 1+Math.min(helper(node.left), helper(node.right));
    }
}
