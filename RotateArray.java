package Grind75;

import java.security.ProtectionDomain;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }

//    works but too much time

//    public static void rotate(int[] nums, int k) {
//        for (int i = 0; i < k; i++) {
//            swapper(nums);
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//    private static void swapper (int[] arr){
//        int first = arr[arr.length-1];
//        for (int i = arr.length-2; i >=0 ; i--) {
//            arr[i+1]=arr[i];
//        }
//        arr[0]=first;
//    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // reverse entire array
        reverse(nums, 0, n - 1);
        // reverse first part
        reverse(nums, 0, k - 1);
        // reverse second part
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
