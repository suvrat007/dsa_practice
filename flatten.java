package Grind75;

public class flatten {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        if (head==null){
            return head;
        }
        Node node = head;
        while(node!=null){
            if (node.child!=null){
                Node temp = node;
                Node kid = temp.child;
                Node last = kid;
                while(last.next!=null){
                    last=last.next;
                }
                if (temp.next!= null){
                    last.next=temp.next;
                    temp.next.prev=last;

                }


                temp.next=kid;
                kid.prev=temp;
                temp.child=null;

            }
            node=node.next;

        }
        return head;
    }
}
