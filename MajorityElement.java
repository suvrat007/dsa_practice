package Grind75;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }

        int n = nums.length;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;

    }
}
