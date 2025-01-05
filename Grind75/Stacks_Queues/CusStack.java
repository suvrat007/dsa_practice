package Grind75.Stacks_Queues;

public class  CusStack {
    protected int[] data;               // array with defined length
    private static final int DEFAULT_SIZE= 10;

    int ptr = -1;

    public CusStack(){
        this(DEFAULT_SIZE);
    }
    public CusStack(int size){
        this.data=new int[size];
    }
    public boolean push (int item){

        if (isFull()){
            System.out.println("STACK OVERFLOW");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack !!");
        }
        int removed =data[ptr];
        ptr--;
        return removed;
        //return data[ptr--];
    }
    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot peek from an empty stack !!");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr==-1;
    }

}
