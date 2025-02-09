package Grind75;

public class MinStack {

    protected int[] data;
    protected int[] minData;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public MinStack() {
        this(DEFAULT_SIZE);
    }

    public MinStack(int size) {
        this.data = new int[size];
        this.minData = new int[size];
    }

    public void push(int val) {
        if (ptr == data.length-1){
            resize(2 * data.length);
        }
        data[++ptr] = val;
        if (ptr == 0) {
            minData[ptr] = val;
        } else {
            minData[ptr] = Math.min(val, minData[ptr - 1]);
        }
    }

    public void pop() {
        ptr--;
    }

    public int top() {
        return data[ptr];
    }

    public int getMin() {

        return minData[ptr];
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        int[] newMinData = new int[newCapacity];
        for (int i = 0; i <= ptr; i++) {
            newData[i] = data[i];
            newMinData[i] = minData[i];
        }
        data = newData;
        minData = newMinData;
    }
}
