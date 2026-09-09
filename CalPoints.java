package Grind75;

import java.util.Stack;

public class CalPoints {
    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(arr));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")){
                stack.pop();
            }else if (operations[i].equals("D")){
                stack.push( stack.peek()*2);
            } else if (operations[i].equals("+")) {
                int f = stack.pop();
                int s =stack.pop();
                int sum = s+f;
                stack.push(s);
                stack.push(f);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;

        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;

    }
}
