package Grind75;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        if (nums.length == 0) return str;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                arr.add(nums[i]);
            } else {
                if (arr.size() == 1) {
                    str.add(String.valueOf(arr.get(0)));
                } else {
                    str.add(arr.get(0) + "->" + arr.get(arr.size() - 1));
                }
                // start a new range
                arr.clear();
                arr.add(nums[i]);
            }
        }

        if (arr.size() == 1) {
            str.add(String.valueOf(arr.get(0)));
        } else {
            str.add(arr.get(0) + "->" + arr.get(arr.size() - 1));
        }

        return str;
    }

}
