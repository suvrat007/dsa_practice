package Grind75;

import com.sun.jdi.CharType;

import java.util.*;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();

        ArrayList<String> str = new ArrayList<>();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i],1);
            } else{
                map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])){
                map.put(arr2[i],1);
            } else{
                map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue()==1){
                str.add(e.getKey());
            }
        }

        return str.toArray(new String[0]);
    }
}
