package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        ArrayList<ArrayList<String>> ans = new ArrayList<>();
//        char[][] charArray = new char[strs.length][];
//
//        //convert all to character
//        for (int i=0 ; i<strs.length ; i++){
//            char[] ch = strs[i].toCharArray();
//            Arrays.sort(ch);
//            charArray[i] =ch;
//        }
//
//        HashMap<Integer,String> map = new HashMap<>();
//        for (int i = 0; i < charArray.length; i++) {
//            map.put(hf(charArray[i]),strs[i]);
//        }
//
//    }
//    public int hf(char[] c){
//        int sum = 0;
//        for (int i = 0; i < c.length; i++) {
//            sum+=(int)c[i] ;
//        }
//        return sum%16;
//    }


    public List<List<String>> groupAnagrams(String[] strs) {
        // Use a HashMap to group strings by their sorted character arrays as keys
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch); // Use sorted string as the key

            // Add the original string to the corresponding group in the map
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
    }

}
