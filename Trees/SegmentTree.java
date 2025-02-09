package Grind75.Trees;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr= {2,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
    }

    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }


    Node root;

    public SegmentTree(int[] arr){
        this.root = construstTree(arr , 0 , arr.length-1);
    }

    protected Node construstTree(int[] arr , int start , int end){
        if (start == end){
            Node leaf = new Node(start , end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start , end);
        int mid = (start+end)/2;

        node.left = construstTree(arr , start , mid);
        node.right=construstTree(arr , mid+1 , end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi , int qei){
        return this.query(this.root, qsi , qei);
    }

    private int query(Node node , int qsi , int qei){
        if (node.startInterval>= qsi && node.endInterval<=qei){
            // node in completely inside
            return node.data;
        } else if(node.startInterval < qsi || node.endInterval > qei){
            // no contribution....completely outside
            return 0;
        }else{
            return this.query(node.left , qsi , qei)+ this.query(node.right , qsi , qei);
        }
    }

    //update
    public void update (int index, int value){
        this.root.data = update(this.root , index,value);
    }

    private int update(Node node, int index , int value){
        if (index >= node.startInterval && index <=node.endInterval){
            if (index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left , index , value);
                int rightAns = update(node.right , index , value);

                node.data= leftAns +rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
