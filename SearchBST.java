package Grind75;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root,val);
    }

    public TreeNode helper(TreeNode node, int val){
        if(node==null){
            return null;
        }
        if (node.val==val){
            return node;
        }
        if (node.val>val){
            return helper(node.left,val);
        }else{
            return helper(node.right,val);
        }
    }
}
