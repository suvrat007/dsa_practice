package Grind75;

import java.util.ArrayList;

public class FindMode {

    public static int[] findMode(TreeNode root) {
        TreeNode node=root;
        ArrayList<Integer> list = new ArrayList<>();
        helper(node , list);

        // get mode from arraylist of node items
        int maxCount = 0;
        ArrayList<Integer> modes = new ArrayList<>();

        for (int num : list) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == num) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(num);
            } else if (count == maxCount && !modes.contains(num)) {
                modes.add(num);
            }
        }

        int[] result = new int[modes.size()];

        for (int i = 0; i < modes.size(); i++) {
            result[i]= modes.get(i);
        }

        return result;



    }


    public static void helper(TreeNode node , ArrayList<Integer> list){
        if (node == null) {
            return;
        }
        list.add(node.val);

        if (node.left != null) {
            helper(node.left, list);
        }
        if (node.right != null) {
            helper(node.right, list);
        }

    }
}
