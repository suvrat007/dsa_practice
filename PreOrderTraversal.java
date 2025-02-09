package Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class PreOrderTraversal {
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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        preorderTraversalHelper(root , list);
        return list;

    }

    public void preorderTraversalHelper(TreeNode node ,ArrayList<Integer> list ){
        if (node==null){
            return;
        }
        list.add(node.val);
        preorderTraversalHelper(node.left,list);
        preorderTraversalHelper(node.right,list);
    }
}
