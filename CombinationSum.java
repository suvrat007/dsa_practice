package Grind75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combinationSumHelper(candidates, target,0, current, result);
        return result;
    }

    private void combinationSumHelper(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            combinationSumHelper(candidates,target - candidates[i], i, current, result); // Allow duplicates
            current.remove(current.size() - 1);
        }
    }
}
