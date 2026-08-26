package Grind75;

import javax.management.monitor.GaugeMonitor;
import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // marks the ones we dont care about
        for (int i = 0; i < n; i++) {
            if (nums[i]>n || nums[i]<=0){
                nums[i] = nums.length+1;
            }
        }

        // mark the ones that already exists
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) continue;

            if (nums[num-1] > 0){
                nums[num-1] = -nums[num-1];
            }
        }

        // find first missing pos
        for (int i = 0; i < n; i++) {
            if (nums[i]>0){
                return i+1;
            }
        }

        return n+1;
    }
}
