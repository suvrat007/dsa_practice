package Grind75;

import java.util.List;

public class RemoveNthFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sizeCounter = 1;
        ListNode node = head;
        while (node.next!=null){
            node=node.next;
            sizeCounter++;
        }

        ListNode temp = head;
        for (int i = 0; i < sizeCounter-n-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;

    }
}
