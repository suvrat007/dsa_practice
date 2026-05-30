package Grind75;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        return solve(result,0, subList, nums);
    }

    public static List<List<Integer>>  solve(List<List<Integer>> finalList, int idx, List<Integer> subList, int[] arr){
        if (idx==arr.length){
            finalList.add(new ArrayList<>(subList));
            return finalList;
        }
        subList.add(arr[idx]);
        solve(finalList, idx+1 , subList, arr);
        subList.remove(subList.size()-1);
        solve(finalList,idx+1, subList,arr);

        return finalList;

    }
}
