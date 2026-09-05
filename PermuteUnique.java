package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        backtrack(new boolean[nums.length] , result,nums, new ArrayList<>() );
        return result;
    }

    public void backtrack(boolean[] used , List<List<Integer>> resultList , int[] nums, ArrayList<Integer> tempList){
        if (tempList.size()==nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            tempList.add(nums[i]);
            used[i]=true;

            backtrack(used, resultList,nums,tempList);

            used[i]=false;
            tempList.remove(tempList.size()-1);

        }
    }
}
