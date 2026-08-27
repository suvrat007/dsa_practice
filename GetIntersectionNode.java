package Grind75;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // mine and correct

//        if (headA.next==null || headB.next==null) return null;
//
//        Set<ListNode> visited = new HashSet<>();
//        ListNode curr = headA;
//
//        while(curr!=null){
//            visited.add(curr);
//            curr=curr.next;
//        }
//
//        curr = headB;
//
//        while (curr!=null){
//            if (visited.contains(curr)){
//                return curr;
//            }
//            curr=curr.next;
//        }
//
//        return null;

        // optimal

        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB=headB;

        while(pA!=pB){
            pA= (pA==null) ? headB : pA.next;
            pB= (pB==null) ? headA: pB.next;
        }

        return pA;
    }
}
