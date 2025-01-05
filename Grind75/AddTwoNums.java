package Grind75;

import java.util.List;

public class AddTwoNums {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head1 = l1;
//        int num1 = 0;
//        int multi=1;
//
//        while (head1!=null){
//            num1= num1+(head1.val)*multi;
//            multi*=10;
//            head1=head1.next;
//        }
//        ListNode head2 = l2;
//        int num2 = 0;
//        multi=1;
//
//        while (head2!=null){
//            num2= num2+(head2.val)*multi;
//            multi*=10;
//            head2=head2.next;
//        }
//
//        int sum = num1 + num2;
//        ListNode dummy = new ListNode(0);
//        ListNode dummyHead = dummy;
//
//        if (sum == 0) {
//            return new ListNode(0);
//        }
//
//
//        while (sum>0){
//            dummyHead.next=new ListNode(sum%10);
//            sum/=10;
//            dummyHead=dummyHead.next;
//        }
//        return dummy.next;



//        will give proble bcoz of limit of int

        ListNode node = new ListNode(0);
        ListNode head = node;
        int carry = 0;

        while(l1!=null || l2!=null ){
            int x = (l1!=null) ? l1.val : 0;
            int y = (l2!=null) ? l2.val : 0;
            int sum = carry+x+y;

            carry=sum/10;
            head.next=new ListNode(sum%10);
            head = head.next;

            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;

        }

        if(carry>0){
            head.next=new ListNode(carry);
        }

        return node.next;
    }
}
