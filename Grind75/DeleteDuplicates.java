package Grind75;


public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }

        ListNode current = head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev =dummy;


        while(current!=null && current.next!=null){


            if (current.val == current.next.val){
//                prev.next = prev.next.next.next;
//                current = prev.next;
                while(current.next!=null && current.val== current.next.val){
                    //skip duplicates
                    current=current.next;
                }
                //skip all duplicates
                prev.next=current.next;
            }else{
                prev=current;
            }
            current = current.next;

        }
        return dummy.next;
    }
}
