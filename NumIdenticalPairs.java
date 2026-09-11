package Grind75;

public class NumIdenticalPairs {
//    public int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] n = new int[101];

        for (int a : nums){
            n[a]++;
        }

        for(int a : n){
            count+=a*(a-1)/2;
        }
        return count;
    }
}