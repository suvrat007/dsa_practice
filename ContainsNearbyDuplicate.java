package Grind75;

import java.util.ArrayList;
import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arr,2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx=0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(idx - map.get(nums[i]))<=k){
                return true;
            }else{
                map.put(nums[i],i);
            }
            idx++;
        }
        return false;
    }
}
