package Grind75;


public class MinimumReplacement {
    public long minimumReplacement(int[] nums) {
        long res = 0;
        int n = nums.length;
        long maxMinVal = nums[n-1];

        for (int i = n-2; i >=0 ; i--) {
            long parts = Math.ceilDiv(nums[i] , maxMinVal);

            res+=parts-1;

            maxMinVal=nums[i]/parts;
        }

        return res;
    }
}
