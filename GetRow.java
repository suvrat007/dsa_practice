package Grind75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;

        for (int j = 0; j <= rowIndex; j++) {
            row.add((int) val);
            val = val * (rowIndex - j) / (j + 1);
        }

        return row;

    }
}
