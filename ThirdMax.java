package Grind75;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num:nums){
            Long val = (long) num;

            if ((val == first) ||  (val == second) || (val == third)) {
                continue;
            }

            if (val > first) {
                third = second;
                second = first;
                first = val;
            } else if (val > second) {
                third = second;
                second = val;
            } else if (val > third) {
                third = val;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;

    }
}
