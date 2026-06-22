package Grind75;

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> leftover = new ArrayList<>();

        // Initialize map keys for arr2 elements with 0 count.
        for (int num : arr2) {
            freq.put(num, 0);
        }

        // Count arr1 elements: if in arr2  , count in map; else add to leftover.
        for (int num : arr1) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                leftover.add(num);
            }
        }

        int[] ans = new int[arr1.length];
        int idx = 0;

        // Fill answer in arr2 order
        for (int key : arr2) {
            int count = freq.get(key);
            for (int i = 0; i < count; i++) {
                ans[idx++] = key;
            }
        }

        // Sort leftovers and append
        Collections.sort(leftover);
        for (int val : leftover) {
            ans[idx++] = val;
        }

        return ans;
    }

}
