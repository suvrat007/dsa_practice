package Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i =0,j=i+1,k=j+1;
        Arrays.sort(nums);

        while(k< nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
                // add triplet to ans array
                list.add(i);
                list.add(j);
                list.add(k);
            }
            ans.add(list);
            k++;
        }
        while(j< nums.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
                // add triplet to list array
                list.add(i);
                list.add(j);
                list.add(k);
            }
            // add triplet in list to ans
            ans.add(list);

            j++;
        }
        while(i< nums.length-2){
            ArrayList<Integer> list = new ArrayList<>();
            if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
                // add triplet to ans array
                list.add(i);
                list.add(j);
                list.add(k);
            }
            ans.add(list);
            i++;
        }

        return ans;

    }
}
