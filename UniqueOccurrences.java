package Grind75;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
//    public boolean uniqueOccurrences(int[] arr) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])){
//                map.replace(arr[i], map.get(arr[i])+1);
//            } else {
//                map.put(arr[i],1);
//            }
//        }
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int freq : map.values()) {
//            if (set.contains(freq)) {
//                return false;
//            }
//            set.add(freq);
//        }
//
//        return true;
//
//    }

    public boolean uniqueOccurrences(int[] arr) {
        int[] memo= new int[2001];

        for (int i = 0; i < arr.length; i++) {
            memo[1000+arr[i]]++;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < memo.length; i++) {
            if (memo[i]!=0){
                if (set.contains(memo[i])){
                    return false;
                }else{
                    set.add(memo[i]);
                }
            }
        }

        return true;

    }
}
