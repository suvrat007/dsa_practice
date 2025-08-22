package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int lengthOfNum1 = nums1.length;
        int lengthOfNum2 = nums2.length;
        if (lengthOfNum2>=lengthOfNum1){
            Arrays.sort(nums2);
            for (int i = 0; i < nums1.length; i++) {
                if (search(nums1[i],nums2)){
                    arr.add(nums1[i]);
                }
            }
        }
        if (lengthOfNum2<lengthOfNum1){
            Arrays.sort(nums1);
            for (int i = 0; i < nums2.length; i++) {
                if (search(nums2[i],nums1)){
                    arr.add(nums2[i]);
                }
            }
        }

        if (arr.size()==1 || arr.size()==0) return arr.stream().mapToInt(Integer::intValue).toArray();

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }

        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer key : map.keySet()){
            result.add(key);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    private boolean search(int tgt, int[] arr ){
        int s=0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s + (e - s) / 2;
            if (arr[mid] == tgt) return true;
            if (arr[mid] > tgt) e = mid - 1;
            else s = mid + 1;
        }
        return false;
    }
}
