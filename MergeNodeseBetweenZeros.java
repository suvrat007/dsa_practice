package Grind75;

public class MergeNodeseBetweenZeros {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {

          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
     }

    public ListNode mergeNodes(ListNode head) {
        ListNode newNode = new ListNode(); // created new linked list node
        ListNode newHead = newNode;
        ListNode temp = head;
        int sum = 0;
        while(temp.next!=null){
            if (temp.val!=0){
                sum+= temp.val;
            }else{
                ListNode node = new ListNode(sum);
                newNode.next = node;
                newNode=newNode.next;
                sum=0;
            }
            temp = temp.next;
        }
        return newHead.next;
    }



}
