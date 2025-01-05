package Grind75;

import java.util.Stack;

public class AdjacentDuplicate {
    public String removeDuplicates(String s) {
        return removeDuplicatesHelper(s , "");
    }

    String removeDuplicatesHelper(String s ,String p){
        Stack<Character> stack = new Stack<>();

        for (int i = s.length()-1; i >=0; i--) {
            stack.push(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()){
            char ch = stack.pop();

            if (result.length()==0 || result.charAt(result.length()-1)!=ch){
                result.append(ch);
            }else{
                result.deleteCharAt(result.length()-1);
            }
        }
        return result.toString();

    }
}
