package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersect {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                map.replace(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])){
                if (map.get(nums2[i])!=0){
                    map.replace(nums2[i],map.get(nums2[i])-1);
                    list.add(nums2[i]);
                }else{
                    map.remove(nums2[i]);
                }
            }
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
