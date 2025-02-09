package Grind75;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{()}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

//        int counter=s.length()/2;
//
//        for (int i = 0; i < s.length(); i++) {
//
////            if (s.charAt(i)==')' && s.charAt(i-1)=='('){
////                counter--;
////            }
////            if (s.charAt(i)=='}' && s.charAt(i-1)=='{'){
////                counter--;
////            }
////            if (s.charAt(i)==']' && s.charAt(i-1)=='['){
////                counter--;
////            }
//
//            if (s.charAt(i)=='('){
//                for (int j = i; j < s.length(); j++) {
//                    if (s.charAt(j)=='}' && (j-i-1)%2==0){
//                        counter--;
//                    }
//                }
//            }
//
//            if (s.charAt(i)=='{'){
//                for (int j = i; j < s.length(); j++) {
//                    if (s.charAt(j)=='}' && (j-i-1)%2==0){
//                        counter--;
//                    }
//                }
//            }
//
//            if (s.charAt(i)=='['){
//                for (int j = i; j < s.length(); j++) {
//                    if (s.charAt(j)==']' && (j-i-1)%2==0){
//                        counter--;
//                    }
//                }
//            }
//        }
//
//        if (counter==0){
//            return true;
//        }
//        return false;



        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if (stack.isEmpty()){
                    return false;
                }

                char closing= stack.peek();
                if (s.charAt(i)==')' && closing == '(' || s.charAt(i)=='}' && closing == '{' || s.charAt(i)==']' && closing == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
