package Grind75;

import java.util.Arrays;

public class MaxProd3Digit {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
//        Arrays.sort(nums);
//        int max = nums[0]*nums[1]*nums[2] ;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i] * nums[j] * nums[k]>=max){
//                        max = nums[i] * nums[j] * nums[k];
//
//                    }
//                }
//            }
//        }
//        return max;

        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: Product of the three largest positive numbers
        int maxProduct1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Product of the largest positive number and the two smallest negative numbers
        int maxProduct2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct1, maxProduct2);
    }
}
