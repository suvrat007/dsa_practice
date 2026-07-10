package Grind75;

public class MaxProduct {
    public static void main(String[] args) {
        int[] num = {-2,0,-1};
        System.out.println(maxProduct(num));
    }
    public static int maxProduct(int[] nums) {
        int pref = 1;
        int suff = 1;

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (pref==0) pref=1;
            if (suff==0) suff=1;

            pref *= nums[i];
            suff *= nums[nums.length-i-1];

            maxi = Math.max(maxi, Math.max(suff,pref));

        }
        return maxi;

    }
}
