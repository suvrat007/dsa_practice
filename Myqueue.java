package Grind75;

import java.util.ArrayList;

public class Myqueue {
    private ArrayList<Integer> arr;

    public Myqueue() {
        arr = new ArrayList<>();
    }

    public void push(int item) {
        arr.add(item); // Add item to the end of the list
    }

    public int pop() {
        if (arr.isEmpty()) {
            return -1; // Return -1 if the queue is empty
        }
        int num = arr.get(0); // Get the first element
        arr.remove(0); // Remove the first element
        return num;
    }

    public int peek() {
        if (arr.isEmpty()) {
            return -1; // Return -1 if the queue is empty
        }
        return arr.get(0); // Return the first element without removing it
    }

    public boolean empty() {
        return arr.isEmpty(); // Check if the list is empty
    }
}
