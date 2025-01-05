package StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(4);
        queue.insert(3);
        queue.insert(33);
        queue.insert(45);

        queue.display();

        System.out.println("\n"+queue.remove());
        queue.insert(133);
        queue.display();
    }
}
