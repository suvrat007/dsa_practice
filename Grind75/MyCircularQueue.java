package Grind75;

public class MyCircularQueue {
    int size = 0;
    int[] data;
    public MyCircularQueue(int k) {
        this.data=new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        data[size++]=value;
        return true;

    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        data[0]=0;
        for (int i = 1; i < size; i++) {
            int temp = data[i];
            data[i]=data[i-1];
            data[i-1]=temp;
        }
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return data[0];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return data[size-1];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size== data.length;
    }

}
