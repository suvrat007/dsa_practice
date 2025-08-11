package Grind75;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNum {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int num = map.get(nums[i]);
                map.replace(nums[i], num + 1); // increment instead of decrement
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;

//        if (nums.length==1){
//            return nums[0];
//        }
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i+=2) {
//            if (nums[i]!=nums[i-1]){
//                return nums[i-1];
//            }
//        }
//        return -1;
    }
}
