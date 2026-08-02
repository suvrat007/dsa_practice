package Grind75;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] demo = {1,3,4,2,2};
        System.out.println(findDuplicateNewOne(demo));
    }
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] ^ nums[i-1]) == 0){
                return nums[i];
            }
        }
        return -1;
    }

    public int findDuplicateNew(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return -1;
    }

    public static int findDuplicateNewOne(int[] nums) {
        int[] ref = new int[nums.length+1];

        for (int i = 0; i < ref.length; i++) {
            if (ref[nums[i]]!=0){
                return nums[i];
            }else{
                ref[nums[i]]=1;
            }
        }

        return -1;
    }
}
