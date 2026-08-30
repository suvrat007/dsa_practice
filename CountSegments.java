package Grind75;

import java.util.Arrays;

public class CountSegments {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }
    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
