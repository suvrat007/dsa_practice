package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(maxFrequency(arr,5));
    }
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long total = 0;
        int left = 0;
        int maxFreq = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
