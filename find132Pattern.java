package Grind75;

import java.util.Stack;

public class find132Pattern {
    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {

//        for (int i = 2; i < nums.length; i++) {
//            if (nums[i-2] < nums[i] && nums[i]< nums[i-1]){
//                return true;
//            }
//        }
//        return false;

        if (nums.length<3 || nums==null){
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int third = 0;

        for (int i = nums.length-1; i >=0; i--) {
            if (nums[i] < third){
                return true;
            }
            while (!stack.isEmpty() && nums[i]>stack.peek()){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;

    }
}
