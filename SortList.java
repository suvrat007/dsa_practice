package Grind75;

import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }

        boolean swapped;
        do {
            swapped=false;
            ListNode curr = head;
            ListNode temp = new ListNode(0);
            temp.next=head;
            ListNode prev = temp;
            while (curr!=null || curr.next!=null){
                if (curr.val>curr.next.val){
                    //swap
                    ListNode nxt = curr.next;
                    curr.next = nxt.next;
                    prev.next = nxt;
                    nxt.next = curr;

                    swapped = true;
                    prev = nxt;
                }else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        }while (swapped);

        return head;
    }
}
