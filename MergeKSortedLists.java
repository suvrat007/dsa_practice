package Grind75;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head0 = lists[0];
        ListNode head1 = lists[1];
        ListNode head2 = lists[2];

        ListNode ans = new ListNode();
        ListNode node = ans;

        ListNode n1 = head0;
        ListNode n2 = head1;
        ListNode n3 = head2;

        //considering all 3 are full
        while(n1.next!=null || n2.next!=null || n3.next!=null ||n1!=null || n2!=null || n3!=null){

            // add the smallest to the ans -- n1
            if(n1.val<=n2.val && n1.val<=n3.val){
                node.val = n1.val;
                n1=n1.next;
            }
            // n2 smallest
            if(n2.val<=n1.val && n2.val<=n3.val){
                node.val = n2.val;
                n2=n2.next;
            }
            // n3 smallest
            if(n3.val<=n2.val && n3.val<=n1.val){
                node.val = n3.val;
                n3=n3.next;
            }

        }


        while(n1!=null || n1.next!=null && n2!=null || n2.next!=null){
            if (n1.val<n2.val){
                ans.next=n1;
                n1=n1.next;
            }else{
                ans.next=n2;
                n2=n2.next;
            }
        }

        while(n1!=null || n1.next!=null && n3!=null || n3.next!=null){
            if (n1.val<n3.val){
                ans.next=n1;
                n1=n1.next;
            }else{
                ans.next=n3;
                n3=n3.next;
            }
        }

        while(n3!=null || n3.next!=null && n2!=null || n2.next!=null){
            if (n3.val<n2.val){
                ans.next=n3;
                n3=n3.next;
            }else{
                ans.next=n3;
                n3=n3.next;
            }
        }
        return ans;

    }
}
