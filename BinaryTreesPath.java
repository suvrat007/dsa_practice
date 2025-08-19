package Grind75;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreesPath {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(traverse(root));
////        result.add(traverse(root))
//
//    }
//
//    public List<Integer> traverse(TreeNode node){
//        List<Integer> temp= new ArrayList<>();
//        while (node.left!=null && node.right!=null) {
//            temp.add(node.val);
//            node = node.left;
//            node= node.right;
//        }
//        return temp;
//     }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root==null)return result;
        dfs(root,"",result);
        return result;
    }

    public void dfs (TreeNode node ,String currentPath , List<String> result){
        if (node==null) return;
        currentPath+=node.val;

        dfs(node.left,currentPath + "->",result);
        dfs(node.right,currentPath +"->",result);

        if (node.left==null && node.right==null){
            result.add(currentPath);
        }
    }
}
