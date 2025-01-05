package Revision.Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int tgt=9;
        System.out.println(Arrays.toString(twoSum(nums,tgt)));
    }
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j]==target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }
//    public static int[] twoSumNew(int[] nums, int target) {
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            int ans = binSearch(i , target , nums);
//            if (ans != -1){
//                int[] arr = {i,ans};
//                return arr;
//            }
//        }
//    }

    public static int binSearch(int idx , int tgt , int[] arr){
        int s = 0;
        int e = arr.length-1;
        int num = arr[idx];
        while(s<=e){
            int mid = s + (e-s)/2;
            if (arr[mid]+num == tgt){
                return arr[mid];
            }else if(arr[mid]+num > tgt){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}

