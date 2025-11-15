package Grind75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesis {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            str.add("(");
            str.add(")");
        }

        StringBuilder subList = new StringBuilder();
        solve(0, str, subList, answer);
        return answer;
    }

    public void solve(int idx, List<String> str, StringBuilder subList, List<String> answer) {
        if (subList.length() == str.size()) {
            if (isValid(subList.toString())) {   // check validity before adding
                answer.add(subList.toString());
            }
            return;
        }

        String ch = str.get(idx);

        subList.append("(");
        solve(idx + 1, str, subList, answer);
        subList.deleteCharAt(subList.length() - 1);

        subList.append(")");
        solve(idx + 1, str, subList, answer);
        subList.deleteCharAt(subList.length() - 1);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // ')'
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
