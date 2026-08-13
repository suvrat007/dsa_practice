package Grind75;

import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public static void main(String[] args) {
        int[] num = {23,2,6,4,7};
        System.out.println(checkSubarraySum(num,13));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        System.gc();
        return false;
    }
}
