package Grind75;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = s.length()-1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }
        String result = "";
        int k = -1;
        while (!stack.isEmpty()){

            char ch = stack.pop();
            String str = "";
            if (Character.isDigit(ch)){
                k = ch - '0';
            }
            if (ch=='['){
                ch = stack.pop();
            }
            if (Character.isLetter(ch)){
                str+=ch;
            }
            if (ch==']'){
                for (int i = 0; i < k; i++) {
                    result+=str;
                }
            }

        }
        return result;
    }
}
