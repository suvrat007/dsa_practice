package Grind75;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] nums = {1,2,0,2,1,1,0,2};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    public static int[] sortColors(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while (mid<=high){
            if(nums[mid]==0){
                nums=swap(mid, low, nums);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                nums=swap(mid,high, nums);
                high--;
            }
        }
        return nums;
    }

    private static int[] swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
}
