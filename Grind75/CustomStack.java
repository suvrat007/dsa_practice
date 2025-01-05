package Grind75;

public class CustomStack {
//    int static final DEFAULT_SIZE = 10;
    int[] data;
    int ptr=-1;
    public CustomStack(int maxSize) {
        this.data=new int[maxSize];
    }

    public void push(int x) {
        if (ptr==data.length-1){
            return;
        }
        ptr++;
        data[ptr]=x;
    }

    public int pop() {
            if (ptr==-1){
                return -1;
            }
        int rem =data[ptr];
        ptr--;
        return rem;
    }

    public void increment(int k, int val) {
        if (ptr==data.length-1){
            return;
        }
        if (data.length<k || data.length>k){
            for (int i = 0; i < data.length; i++) {
                data[i]=val;
            }
        }
        for (int i = 0; i < k; i++) {
            data[i]+=val;
        }
    }
}
