package Grind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDisappearedNumbers {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        boolean[] present = new boolean[n];
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : nums) {
//            present[num - 1] = true;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (!present[i]) {
//                result.add(i+1);
//            }
//        }
//
//        return result;
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
                map.put(num,1);
        }

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i) ) result.add(i);
        }

        return result;
    }

}
