package Grind75;

import java.util.ArrayList;
import java.util.List;

public class SmallerNumAfterSelf {

    public static void main(String[] args) {


    }
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j]<nums[i]){
                    count++;
                }
            }
            list.add(count);
        }

        return list;
    }
}
