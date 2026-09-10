package Grind75;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            while(node!=null){
                min = Math.min(node.val,min);
                max = Math.max(node.val,max);

                node=node.next;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return null;
        }

        int[] nums = new int[max-min+1];

        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];

            while (node != null) {
                nums[node.val - min]++;
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i = 0; i < nums.length; i++) {
            int value = i + min;

            while (nums[i] > 0) {
                current.next = new ListNode(value);
                current = current.next;
                nums[i]--;
            }
        }

        return dummy.next;
    }
}
