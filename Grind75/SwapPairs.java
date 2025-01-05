package Grind75;

import java.util.List;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head.next;
        ListNode prev = head;
        head = node;  // Update head to the second node as it will become the new head

        while (true) {
            ListNode next = node.next;  // Store the next node to be processed
            node.next = prev;           // Swap current pair by pointing the current node to the previous

            // Check if there are more nodes to process and if not, break
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            prev.next = next.next;  // Point the last swapped node to the node after the next pair
            prev = next;            // Move to the next pair
            node = prev.next;
        }

        return head;

    }

    public ListNode swapAlt(ListNode head){
        if (head==null || head.next==null){
            return head;
        }

        ListNode node1 = head;
        ListNode node2 = node1.next;
        head= node2;
        ListNode prev = null;

        while (node1 !=null && node2 !=null){
            swapper(node1, node2);

            if (prev != null) {
                prev.next = node2;  // ensure proper linkage of the list
            }

            // Move to the next pair
            prev = node1;           // second node in the swapped pair
            node1 = node1.next;
            if (node1 != null) {
                node2 = node1.next;
            }
        }
        return head;
    }

    public void swapper(ListNode node1 , ListNode node2){
        node1.next=node2.next;
        node2.next = node1;
    }

}
