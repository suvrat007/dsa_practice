package Grind75;

import Grind75.AddTwoNums;

public class ThirdLastOfLinkedList {
    public static void main(String[] args) {

    }

    public static int ThirdLast(ListNode head){
        ListNode demo = head;
        int size=0;
        while(demo!= null){
            size++;
            demo=demo.next;
        }

        if (size<3){
            return -1;
        }

        ListNode temp = head;
        for (int i = 1; i < size-3; i++) {
            temp=temp.next;
        }

        return temp.val;

    }
}
