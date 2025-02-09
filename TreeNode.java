package Grind75;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static class SwapNodes {
        public ListNode swapPairs(ListNode head){
            if (head==null || head.next==null){
                return head;
            }
            return head;
        }
        public void swapper(ListNode node1, ListNode node2){
            ListNode temp = node1;
            node1 = node2 ;
            node2 = temp;
        }
    }
}
