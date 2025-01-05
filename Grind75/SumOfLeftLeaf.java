package Grind75;

public class SumOfLeftLeaf {
        int sum =0;

        public int sumOfLeftLeaves(TreeNode node) {
    //        TreeNode node = root;
            if (node==null){
                return 0;
            }

            //leaf reached
            if (node.left==null && node.right==null){
                return sum;
            }

            //check if left is leaf
            if (node.left!=null && node.left.right==null && node.left.left==null){
                sum+=node.left.val;
            }


            //recurse on left child
            if (node.left!=null){
                sumOfLeftLeaves(node.left);
            }

            //recurse on right child
            if (node.right!=null){
                sumOfLeftLeaves(node.right);
            }

            return sum;

        }

    public int sumOfLeftLeavesAlt(TreeNode root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // Check if the left node is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        // Recursively call the function on the left and right child nodes
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
