package Grind75;

import java.util.ArrayList;

public class SetZeros {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> coordinateR = new ArrayList<>();
        ArrayList<Integer> coordinateC = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col]==0){

                    coordinateR.add(row);
                    coordinateC.add(col);

                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (coordinateR.contains(i) || coordinateC.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
