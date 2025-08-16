package Grind75;
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
public class CountNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int totalLeft = getDepth(root.left);
        int totalRight = getDepth(root.right);

        if (totalLeft == totalRight) {
            return (int) Math.pow(2, totalLeft) + countNodes(root.right);
        } else {
            return (int) Math.pow(2, totalRight) + countNodes(root.left);
        }
    }

    private int getDepth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

}
