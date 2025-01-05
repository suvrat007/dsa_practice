package LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    public Node find (int val){
        Node node= head;
        while (node!=null){
            if (node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int val, int index){
        Node p = find(val);
        if (p==null){
            System.out.println("DNE");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;

        if (node.next!=null){
            node.next.prev=node;
        }
        


    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev= null;
        if (head!= null){
            head.prev=node;
        }
        head=node;

    }
    public void insertLast(int val){
        Node node= new Node(val);
        Node last = head;

        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next !=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;

    }
    public void display(){
        Node node=head;
        while (node != null){
            System.out.println(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;
        private Node(int val) {
            this.val = val;
        }
        private Node(int val, Node node, Node prev) {
            this.val = val;
            this.next = node;
            this.prev = prev;
        }
    }
}
