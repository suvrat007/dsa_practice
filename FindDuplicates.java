package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDuplicates(nums).toArray()));
    }
//    public static List<Integer> findDuplicates(int[] nums) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])){
//                ans.add(nums[i]);
//                map.remove(nums[i]);
//            }else{
//                map.put(nums[i], 1 );
//            }
//        }
//
//        return ans;
//    }
//    public static List<Integer> findDuplicates(int[] nums) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        int f = 1;
//        int s = 0;
//        while (s< nums.length-1 && f< nums.length){
//            if (nums[s]==nums[f]){
//                ans.add(nums[s]);
//            }
//            s++;
//            f++;
//        }
//
//        return ans;
//    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int seen = Math.abs(nums[i]);
            int idx = seen-1;

            if (nums[idx]<0){
                ans.add(seen);
            }else{
                nums[idx]=-nums[idx];
            }
        }

        return ans;
    }
}
