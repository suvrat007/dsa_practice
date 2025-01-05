package Grind75;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
////        char[] charS = new char[s.length()];
////        charS= s.toCharArray();
//
//        int glbCtr=0;
//        int ctr = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (!map.containsKey(ch)){
//                map.put(ch,1);
//                ctr++;
//            }else{
//                if (ctr>glbCtr){
//                    glbCtr = ctr;
//                }
//                map.put(ch,map.get(ch)+1);
//                ctr=1;
//            }
//        }
//        return glbCtr;


            HashMap<Character, Integer> map = new HashMap<>(); // Stores the last index of each character
            int glbCtr = 0; // Global maximum length
            int start = 0; // Start of the current substring

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                // If the character is already in the map and its index is within the current window
                if (map.containsKey(ch) && map.get(ch) >= start) {
                    start = map.get(ch) + 1; // Move the start to avoid repeating characters
                }

                // Update the map with the current character's position
                map.put(ch, i);

                // Update the global maximum length
                glbCtr = Math.max(glbCtr, i - start + 1);
            }

            return glbCtr;


    }
}
