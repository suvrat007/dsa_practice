package Grind75;

import java.util.ArrayList;

public class PostOrderTraveral {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorderTraversalHelper(root , list);
        return list;

    }

    public void preorderTraversalHelper(TreeNode node , ArrayList<Integer> list ){
        if (node==null){
            return;
        }
        preorderTraversalHelper(node.left,list);
        preorderTraversalHelper(node.right,list);
        list.add(node.val);
    }


}
