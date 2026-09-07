package Grind75;

public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int temp = 0;
        int sum = 0 ;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                temp++;
                sum+=temp;
            }else{
                temp=0;
            }
        }

        return sum;
    }
}
