package Grind75;

import java.util.Queue;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String res = "";
            for (int i = 0; i < strs[0].length(); i++) {
                char com = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != com){
                        return res;
                    }
                }
                res+=com;
            }
            return res;
    }
}