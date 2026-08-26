package Grind75;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return "";
        }

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();
        int formed =0;

        Map<Character,Integer> windowCounts = new HashMap<>();

        int left = 0;
        int right = 0;

        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right<s.length()){
            char c = s.charAt(right);
            windowCounts.put(c,windowCounts.getOrDefault(c,0)+1);

            if (map.containsKey(c) && windowCounts.get(c).intValue()==map.get(c).intValue()){
                formed++;
            }

            while(left<=right && formed==required){
                if (right-left+1<minLen){
                    minLen=right-left+1;
                    minLeft =left;
                }

                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar)-1);

                if (map.containsKey(leftChar) && windowCounts.get(leftChar).intValue()<map.get(leftChar).intValue()){
                    formed--;
                }

                left++;
            }
            right++;

        }
        return (minLen==Integer.MAX_VALUE) ? "" : s.substring(minLeft, minLeft+minLen);
    }

}
