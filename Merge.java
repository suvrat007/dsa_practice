package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // 1. Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] curr = intervals[0];   // current merged interval
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= curr[1]) {
                // overlap: extend current interval
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                // no overlap: store finished interval, start new
                merged.add(curr);
                curr = next;
            }
        }

        // add the last interval
        merged.add(curr);

        return merged.toArray(new int[merged.size()][2]);
    }
}
