package Grind75;

import java.util.HashMap;

public class FirstUniqChar {
//    public int firstUniqChar(String s) {
//        HashMap <Character,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),i);
//            }else {
//                map.put(s.charAt(i),-1);
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i))>=0){
//                return map.get(s.charAt(i));
//            }
//        }
//
//        return -1;
//    }

    public int firstUniqChar(String s) {
        int[] alphafreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphafreq[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(alphafreq[s.charAt(i)-'a']==1) return i;
        }

        return -1;
    }
    
}
