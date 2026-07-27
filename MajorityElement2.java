package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        majorityElement(nums);
    }
    public static List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;

        int limit = nums.length/3;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while(i<nums.length && j< nums.length){
            if (nums[i]==nums[j]){
                count++;
                j++;
            }else{
                if (count>limit){
                    list.add(nums[i]);
                    System.out.println(nums[i]);
                }
                i=j;
                count = 0;
            }
        }

        if (count > limit) {
            list.add(nums[i]);
        }

        return list;
    }
}
