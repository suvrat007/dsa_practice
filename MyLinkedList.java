package Grind75;


public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node{

        private int val;
        private Node next;

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        private Node(int val) {
            this.val = val;
        }
    }



    public MyLinkedList() {
        this.size=0;
    }

    public int get(int index) {
        if (head==null || index>=size){
            return -1;
        }else {
            Node f = head;
            for (int i = 0; i < index; i++) {
                f = f.next;
            }
            return f.val;
        }
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next=head;
        node = head;
        size++;
        if (tail==null){
            tail=node;
        }
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        if (head== null){
            head=node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }else if (index==size){
            addAtTail(val);
            return;
        }else{
            Node temp=head;
            for (int i = 1; i < index; i++) {
                temp=temp.next;
            }

            Node node=new Node(val,temp.next);
            temp.next=node;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index==0){
            head = head.next;
        }

        if (index==size-1){
            Node temp = head;
            for (int i = 1; i < size-1; i++) {
                temp.next=null;
                tail=temp;
            }
        }else{
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

    }
}
