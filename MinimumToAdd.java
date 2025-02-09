package Grind75;

import java.util.Stack;

public class MinimumToAdd {
    public int minAddToMakeValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='(' ){
//                stack.push(s.charAt(i));
//            }else{
//                if (s.charAt(i)==')' ){
//                    stack.pop();
//                }
//            }
//        }
//        return stack.size();
//    }
        Stack<Character> stack = new Stack<>();
//        int unmatchedClosing = 0; // to count unmatched closing parentheses

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // matched parentheses
                } else {
                    stack.push(s.charAt(i)); // unmatched closing parenthesis
                }
            }
        }

        // Number of unmatched opening parentheses plus unmatched closing parentheses
        return stack.size();

}}
