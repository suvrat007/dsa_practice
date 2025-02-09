package Grind75;

import java.util.ArrayList;

public class LuckyNumbers {
    public ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRow = Integer.MAX_VALUE;
            int minRowIndex = -1;

            // Find the minimum element in the current row and its column index
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minRowIndex = j; // Remember the column index
                }
            }

            // Now, find if this minRow is the largest in its column
            int maxCol = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowIndex] > maxCol) {
                    maxCol = matrix[k][minRowIndex];
                }
            }

            // Check if the minRow is also the max in its column
            if (minRow == maxCol) {
                list.add(minRow);
            }
        }

        return list;

    }
}
