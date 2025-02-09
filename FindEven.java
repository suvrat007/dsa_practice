package Grind75;

import java.util.Stack;

public class FindEven {
    public int findNumbers(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }
        int ans = 0;
        while (!stack.isEmpty()){
            int num = stack.pop();
            int total = 0;
            while(num>0){
                num/=10;
                total++;
            }

            if (total%2==0){
                ans++;
            }
        }

        return ans;
    }
}
