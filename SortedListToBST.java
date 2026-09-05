package Grind75;

import java.util.List;

public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        if (head.next==null) return new TreeNode(head.val);

        ListNode fast = head;
        ListNode slow = head;
        ListNode slowPrev = head;

        while(fast != null && fast.next != null){
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        if (slowPrev != null) {
            slowPrev.next = null;
            root.left = sortedListToBST(head);
        } else {
            root.left = null;
        }
        root.right=sortedListToBST(slow.next);

        return root;
    }
}
