package Grind75;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> q = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        this.q.add(x);
    }

    public int pop() {
        int lastpos= q.size();  //now we know its at that position

        for (int i = 0; i < lastpos-1; i++) {
            q.add(q.poll()); // take from front add to back, while seze keeps track of list element
        }

        return q.poll();

    }

    public int top() {
        int lastpos= q.size();  //now we know its at that position

        for (int i = 0; i < lastpos-1; i++) {
            q.add(q.poll()); // take from front add to back, while seze keeps track of list element
        }

        int val = q.poll();
        q.add(val);

        return val;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
