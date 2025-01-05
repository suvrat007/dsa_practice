package LinkedList;

public class DLLpractise {
    private Node head;
    private Node tail;
    private int size;
    public DLLpractise(){
        size=0;
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next,Node prev) {
            this.val = val;
            this.next=next;
            this.prev=prev;
        }
    }
    private void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        node=head;
        size++;
    }
    private void insertLast(int val){
        Node node=new Node(val);
        if (tail==null){
            head=tail;
        }
        tail.next=node;
        node.next=null;
        node.prev=tail;
        tail=node;
        size++;
    }

}
