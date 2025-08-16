package Grind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        for (int i = 0; i < s.length(); i++) {
            if (tarr[i]!=sarr[i]){
                return tarr[i];
            }
        }
        return tarr[tarr.length-1];
    }
}
