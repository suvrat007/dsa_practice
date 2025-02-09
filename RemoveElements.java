package Grind75;

import java.util.List;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;

        ListNode temp = newhead;
        while (temp.next!=null){
            if (temp.next.val == val){
                temp.next=temp.next.next;
            }else {
                temp = temp.next;
            }
        }

        return newhead.next;
    }
}
