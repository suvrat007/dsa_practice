package StacksAndQueues.Questions;

import java.util.Stack;

public class ImplementQueueByStcks {
    class QueueUsingStack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStack(){
            first = new Stack<>();
            second= new Stack<>() ;
        }

        public void add (int item){
            while (!first.isEmpty()){
                second.push(first.pop());
            }
            first.push(item);

            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }

        public int remove() throws Exception{
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            int removed = second.pop();

            while (!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() throws Exception{

            return first.peek();
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }
    }

}
