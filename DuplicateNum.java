package Grind75;

import java.util.*;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i]==nums[i-1]){
//                return true;
//            }
//
//        }
//        return false;
//    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }
        return false;
    }

}
