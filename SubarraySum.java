package Grind75;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] num = {1,1,1};
        System.out.println(subarraySum(num,2));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int preSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum+=nums[i];
            int remove = preSum-k;
            if (map.containsKey(remove)){
                count+=map.get(remove);
            }
            if (map.containsKey(preSum)){
                map.put(preSum,map.get(preSum)+1);
            } else {
                map.put(preSum,1);
            }
        }

        return count;
    }
}
