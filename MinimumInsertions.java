package Grind75;

import java.util.Stack;

public class MinimumInsertions {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
    }

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (i==0){
//                if (s.charAt(i)=='('){
//                    stack.push(s.charAt(i));
//                }
//            }else {
//                if (s.charAt(i)=='('){
//                    stack.push(s.charAt(i));
//                }else if (s.charAt(i)==')'){
//                    if (s.charAt(i-1)==')' && !stack.isEmpty() && stack.peek()=='('){
//                        stack.pop();
//                    } else {
//                        stack.push(s.charAt(i));
//                    }
//
//                }
//
//
//            }
//
//        }
//        return stack.size();


        int neededRight = 0; // To keep track of needed ')'

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                // This character is ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // It is a "))" case
                    i++; // Move to the next character
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop(); // Match with an opening parenthesis
                    } else {
                        neededRight++; // We need an extra '(' to balance " ))"
                    }
                } else {
                    // It is a ")" case
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop(); // Match with an opening parenthesis
                        neededRight++; // We need one more ')' to make it "))"
                    } else {
                        neededRight += 2; // We need two more ')' to make it valid
                    }
                }
            }
        }

        // The stack size represents the unmatched '('
        return stack.size() * 2 + neededRight;
    }

}
