package Grind75;

public class AverageOfSubtree {
    public int count = 0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }

    public int[] solve(TreeNode node) {
        if (node==null){
            return new int[]{0,0};
        }
        int[] left = solve(node.left);
        int[] right = solve(node.right);

        int subtreeSum = left[0] + right[0] + node.val;
        int noOfNode = left[1] + right[1] +1 ;

        int avg = subtreeSum/noOfNode;

        if (avg==node.val){
            count++;
        }

        return new int[] {subtreeSum,noOfNode};
    }
}
