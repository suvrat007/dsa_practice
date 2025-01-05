package LinkedList;

import java.util.zip.ZipInputStream;

public class LLpractise {
    private Node head;
    private Node tail;
    private int size;
    public LLpractise(){
        this.size=0;
    }

    private class Node {
        private int val;
        private Node next;

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        private Node(int val) {
            this.val = val;
        }

    }   //just made a node

    // insert an element in first position
    private void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }

    //inserting element in last place
    private void insertLast(int val){
        if (tail==null){
            insertFirst(val);
        }
        Node node=new Node(val);
        tail.next=node;
        node=tail;
        size++;
    }

    // removing the first element in the linked list
    private int deleteFirst(){
        int delVal= head.val;;
        head=head.next;
        size--;
        if (head==null){
            head=tail;
        }
        return delVal;
    }

    //displaying the whole linked list
    private void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // inserting at a particular index
    private void insert(int index, int val){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size-1){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        node.next=temp.next.next;
        size++;

    }
    //getting value at a particular index
    private int get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp.val;
    }



}