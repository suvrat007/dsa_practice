package Grind75;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("xywrrmp","xywrrmu#p"));
    }
    public static boolean backspaceCompare(String s, String t) {
//        Stack<Character> StackS = new Stack<>();
//        Stack<Character> StackT = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i)=='#'){
//                StackS.pop();
//            }else{
//                StackS.push(s.charAt(i));
//            }
//        }
//        for (int i = 0; i < t.length(); i++) {
//
//            if (s.charAt(i)=='#'){
//                StackT.pop();
//            }else{
//                StackT.push(s.charAt(i));
//            }
//        }
//
//        int m = Math.max(StackS.size(),StackT.size());
//
//        for (int i = 0; i < m; i++) {
//            if (StackS.pop()!= StackT.pop()){
//                return false;
//            }
//        }
//        return true;
        Stack<Character> StackS = new Stack<>();
        Stack<Character> StackT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!StackS.isEmpty()) {
                    StackS.pop();
                }
            } else {
                StackS.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!StackT.isEmpty()) {
                    StackT.pop();
                }
            } else {
                StackT.push(t.charAt(i));
            }
        }

        while (!StackS.isEmpty() && !StackT.isEmpty()) {
            if (StackS.pop() != StackT.pop()) {
                return false;
            }
        }

        return StackS.isEmpty() && StackT.isEmpty();
    }
}
