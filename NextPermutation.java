package Grind75;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
            int ind = -1;

            // Step 1: find pivot
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    ind = i;
                    break;
                }
            }

            // Step 2: if no pivot, reverse whole array and return
            if (ind == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }

            // Step 3: find element just larger than pivot and swap
            for (int i = nums.length - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }

            // Step 4: reverse suffix from ind+1 to end
            reverse(nums, ind + 1, nums.length - 1);
        }

        private static void reverse(int[] nums, int left, int right) {
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }


}
