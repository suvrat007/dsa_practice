package Grind75;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums , k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        boolean duplicateChecker = false;
        for (int i = 0; i < nums.length; i++) {
            // check if key (arr[i]) exist
            if (map.containsKey(nums[i])){
                duplicateChecker = true;
                if (Math.abs(i-(map.get(nums[i]))) > k){
                    return false;
                }
            }
            map.put(nums[i] , i);
        }
        return duplicateChecker;
    }
}
