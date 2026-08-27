package Grind75;

import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        ListNode temp = head;

        while(temp!=null){
            max = Math.max(max, temp.val);
            min = Math.min(min, temp.val);
            temp=temp.next;
        }

        temp = head;

        int[] freq = new int[max-min+1];

        while(temp!=null){
            int val = temp.val - min;
            freq[val]++;
            temp=temp.next;
        }

        temp=head;

        for (int i = 0; i < freq.length; i++) {
            while(freq[i]>0){
                temp.val = i + min;
                temp=temp.next;
                freq[i]--;
            }

        }

        return head;
    }
}
