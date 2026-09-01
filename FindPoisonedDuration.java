package Grind75;

public class FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int total = duration;

        for (int i = 1; i < timeSeries.length; i++) {
            int gap = timeSeries[i] - timeSeries[i - 1];

            // If overlapping, only the gap is newly poisoned.
            // If not overlapping, the previous attack contributes full duration.
            total += Math.min(gap, duration);
        }

        return total;

    }

}
