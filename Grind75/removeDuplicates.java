package Grind75;

import java.util.HashMap;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int correct = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[correct]!=nums[i]){
                correct++;
                nums[correct]= nums[i];
            }
        }

        return correct+1;

    }
}
