package Grind75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
//    public static int removeDuplicates(int[] nums) {
//            if (nums.length == 0) return 0;
//
//            int write = 1;   // next write position (we keep first element)
//            int count = 1;   // occurrences of current number
//
//            for (int read = 1; read < nums.length; read++) {
//                if (nums[read] == nums[read - 1]) {
//                    count++;
//                } else {
//                    count = 1; // new number starts
//                }
//
//                if (count <= 2) {
//                    nums[write] = nums[read];
//                    write++;
//                }
//            }
//
//            return write;
//    }

    public static int removeDuplicates(int[] nums) {
        int countIdx= 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[countIdx]){
                // for total unique nums
                countIdx++;
                nums[countIdx]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return countIdx+1;
    }
}
