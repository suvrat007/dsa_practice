package Grind75;

import java.util.Arrays;

public class SortColours {
    public void sortColors(int[] nums) {
        int[] totals = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) totals[i]=0;
            if (nums[i]==1) totals[i]=1;
            if (nums[i]==2) totals[i]=2;
        }
        Arrays.sort(totals);
        for (int i = 0; i < nums.length; i++) {
            totals[i]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
