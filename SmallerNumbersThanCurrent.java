package Grind75;

import java.util.Arrays;
import java.util.Stack;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length-1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        int[] arr = new int[nums.length];
        int idx = -1;

        while (!stack.isEmpty()){
            int n = stack.pop();
            int times = 0;

            for (int i = 0; i < nums.length; i++) {
                if (n>nums[i]){
                    times++;
                }
            }
            arr[++idx]=times;

        }
        return arr;
    }
}
