package Grind75;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class GetMinimumDifference {
//    public int getMinimumDifference(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        helper(root,list);
//
//        int mini = Integer.MAX_VALUE;
//
//        for (int i = 1; i < list.size(); i++) {
//            int diff = list.get(i) - list.get(i - 1);
//            mini = Math.min(mini, diff);
//        }
//
//        return mini;
//
//    }
//
//    public static void helper(TreeNode node, ArrayList<Integer> list){
//        if (node==null){
//            return ;
//        }
//
//        helper(node.left,list);
//        list.add(node.val);
//        helper(node.right,list);
//    }

    private Integer prev = null;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode node){
        if (node==null){
            return;
        }

        inorder(node.left);

        if (prev != null) {
            min=Math.min(min,node.val-prev);
        }

        prev=node.val;

        inorder(node.right);
    }
}
