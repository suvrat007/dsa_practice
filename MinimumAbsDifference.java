package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> ans = new ArrayList<>();

            int minDiff = Integer.MAX_VALUE;

            for (int i = 1; i < arr.length; i++) {
                minDiff =Math.min(Math.abs(arr[i]-arr[i-1]), minDiff);
            }

            for (int i = 1; i < arr.length; i++) {
                if (Math.abs(arr[i]-arr[i-1])==minDiff){
                    ans.add(Arrays.asList(arr[i - 1], arr[i]));
                }
            }

            return ans;
        }
}
