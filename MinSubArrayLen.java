package Grind75;

public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(11,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            sum+=nums[right];

            while(sum>=target){
                int currentLen = right-left+1;
                minLength=Math.min(currentLen,minLength);
                sum-=nums[left];
                left++;
            }
        }

        System.gc();
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
