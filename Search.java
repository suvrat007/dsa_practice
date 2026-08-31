package Grind75;

public class Search {
    public int search(int[] nums, int target) {
        // get the breaking index
        int n = nums.length;

        int k = 0 ;
        for (int i = 1; i < n; i++) {
            if (nums[i]<nums[i-1]){
                k=i;
                break;
            }
        }

        //check if we wanna go left or right or no rotation
        if (k == 0) {
            return bs(0, n - 1, nums, target);
        }

        if (target>=nums[k] && target<=nums[n-1]){
            // bs right
            return bs(k,n-1,nums,target);
        }else{
            return bs(0,k-1,nums,target);
        }
    }
    public int bs(int left, int right, int[] arr , int target){
        while(left<=right){
            int mid = left + (right-left) / 2;

            if (target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
