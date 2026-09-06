package Grind75;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int row = triangle.size() - 2; row >= 0; row--) {
            List<Integer> current = triangle.get(row);
            List<Integer> below = triangle.get(row + 1);

            for (int col = 0; col < current.size(); col++) {
                int minBelow = Math.min(below.get(col), below.get(col + 1));
                int updated = current.get(col) + minBelow;
                current.set(col, updated);
            }
        }

        return triangle.get(0).get(0);
    }
}
