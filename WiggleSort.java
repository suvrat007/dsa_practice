package Grind75;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 1;
        int j = n-1;
        int[] arr = new int[n];
        while(i<n){
            arr[i]=nums[j];
            i+=2;
            j--;
        }

        i=0;
        while(i<n){
            arr[i]=nums[j];
            i+=2;
            j--;
        }

        for (int k = 0; k < n; k++) {
            nums[k]=arr[k];
        }
    }
}
