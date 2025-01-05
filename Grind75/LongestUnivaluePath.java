package Grind75;

public class LongestUnivaluePath {
    int path = 0;

    public int longestUnivaluePath(TreeNode root) {
        // Edge case: If the root is null, there's no path, so return 0
        if (root == null) {
            return 0;
        }

        // Update the path by calling the helper method to calculate the longest univalue path
        longestUnivaluePathHelper(root);

        // Return the longest univalue path found
        return path;
    }

    private int longestUnivaluePathHelper(TreeNode node) {
        if (node == null) {
            return 0;  // Base case: If the node is null, return 0
        }

        // Recursively find the longest univalue path in the left and right subtrees
        int leftPath = longestUnivaluePathHelper(node.left);
        int rightPath = longestUnivaluePathHelper(node.right);

        // Initialize the maximum path lengths for left and right
        int leftMax = 0, rightMax = 0;

        // Check if the current node has the same value as its left child
        if (node.left != null && node.val == node.left.val) {
            leftMax = leftPath + 1;
        }

        // Check if the current node has the same value as its right child
        if (node.right != null && node.val == node.right.val) {
            rightMax = rightPath + 1;
        }

        // Update the global path variable to store the longest path seen so far
        path = Math.max(path, leftMax + rightMax);

        // Return the longest path that includes the current node
        return Math.max(leftMax, rightMax);
    }
}
