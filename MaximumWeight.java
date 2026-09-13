package Grind75;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumWeight {
    static class Result {
        long score;
        List<Integer> indices;

        Result(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    int[][] intervals;
    int[] starts;
    int[] next;
    Result[][] memo;

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();

        this.intervals = new int[n][4];

        for (int i = 0; i < n; i++) {
            this.intervals[i][0] = intervals.get(i).get(0);
            this.intervals[i][1] = intervals.get(i).get(1);
            this.intervals[i][2] = intervals.get(i).get(2);
            this.intervals[i][3] = i;
        }

        Arrays.sort(this.intervals, (a, b) -> Integer.compare(a[0], b[0]));

        starts = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = this.intervals[i][0];
        }

        next = new int[n];

        for (int i = 0; i < n; i++) {
            next[i] = findNext(this.intervals[i][1]);
        }

        memo = new Result[n][5];

        Result answer = solve(0, 4);

        Collections.sort(answer.indices);

        int[] result = new int[answer.indices.size()];

        for (int i = 0; i < answer.indices.size(); i++) {
            result[i] = answer.indices.get(i);
        }

        return result;
    }

    public Result solve(int i, int remaining) {
        if (i == intervals.length || remaining == 0) {
            return new Result(0, new ArrayList<>());
        }

        if (memo[i][remaining] != null) {
            return memo[i][remaining];
        }

        Result skip = solve(i + 1, remaining);

        Result afterTake = solve(next[i], remaining - 1);

        List<Integer> takeIndices = new ArrayList<>(afterTake.indices);
        takeIndices.add(intervals[i][3]);
        Collections.sort(takeIndices);

        Result take = new Result(
                intervals[i][2] + afterTake.score,
                takeIndices
        );

        if (isBetter(take, skip)) {
            memo[i][remaining] = take;
        } else {
            memo[i][remaining] = skip;
        }

        return memo[i][remaining];
    }

    public boolean isBetter(Result a, Result b) {
        if (a.score != b.score) {
            return a.score > b.score;
        }

        int length = Math.min(a.indices.size(), b.indices.size());

        for (int i = 0; i < length; i++) {
            if (!a.indices.get(i).equals(b.indices.get(i))) {
                return a.indices.get(i) < b.indices.get(i);
            }
        }

        return a.indices.size() < b.indices.size();
    }

    public int findNext(int end) {
        int left = 0;
        int right = starts.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (starts[mid] > end) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
