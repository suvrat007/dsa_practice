package Grind75.Stacks_Queues;

import java.util.*;

public class InBuiltEg {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        System.out.println(queue.remove());
//
//        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);

        System.out.println(deque.removeFirst());

    }
}
