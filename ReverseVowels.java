package Grind75;

import java.util.Arrays;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] charS = s.toCharArray();
        int start = 0;
        int end = charS.length - 1;

        while (start < end) {
            boolean f = isVowel(charS[start]);
            boolean e = isVowel(charS[end]);

            if (f && e) {
                // swap
                char ch = charS[start];
                charS[start] = charS[end];
                charS[end] = ch;

                start++;
                end--;
            } else if (!f) {
                start++;
            } else if (!e) {
                end--;
            }
        }
        return new String(charS);
    }

    private boolean isVowel(char c) {
        return (c=='a' || c=='A' || c=='e' || c=='E' ||
                c=='i' || c=='I' || c=='o' || c=='O' ||
                c=='u' || c=='U');
    }

}
