package Grind75;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // make variable store total product
        int prod = 1;
        int zeroCount = 0;
        int zeroInd = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i]==0){
                zeroCount++;
                zeroInd=i;
            } else {
                prod*=nums[i];
            }
        }

        if (zeroCount>1){
            return ans;    // all zeros
        }

        if (zeroCount==1){
            ans [zeroInd] = prod;
            return ans;
        }

        // divide and store in answer
        for (int i = 0; i < n; i++) {
            ans[i]=prod/nums[i];
        }

        return ans;
    }
}
