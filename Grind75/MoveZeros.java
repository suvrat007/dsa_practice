package Grind75;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={1};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int nonzero=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[nonzero]=nums[i];
                nonzero++;
            }
//            nums[i]=0;
        }

        while (nonzero < nums.length) {
            nums[nonzero] = 0;
            nonzero++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
