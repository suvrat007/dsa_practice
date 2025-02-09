package Grind75;

import java.util.ArrayList;
import java.util.List;

//public class SpiralMatrix {
//    List<Integer> list = new ArrayList<>();
//    int row = 0;
//    int col = 0;
//
//    public List<Integer> spiralOrder(int[][] matrix) {
//        right(matrix,0,0);
//        return list;
//    }
//
//    private void right(int[][] matrix, int r, int c){
//        if (matrix[r][c]==-1 || c==matrix[0].length-1){
//            list.add(matrix[r][c]);
//
//            matrix[r][c] = -1;
//            down(matrix,r+1,c);
//            return;
//        }
//
//        list.add(matrix[r][c]);
//        matrix[r][c] = -1;
//        right(matrix, r,c+1);
//    }
//    private void down (int[][] matrix, int r, int c){
//        if (matrix[r][c]==-1 || r==matrix.length-1){
//            list.add(matrix[r][c]);
//
//            matrix[r][c] = -1;
//            left(matrix,r,c-1);
//            return;
//        }
//
//        list.add(matrix[r][c]);
//        matrix[r][c] = -1;
//        down(matrix, r+1,c);
//    }
//    private void left (int[][] matrix, int r, int c){
//        if (matrix[r][c]==-1 || c==0){
//            list.add(matrix[r][c]);
//
//            matrix[r][c] = -1;
//            up(matrix,r,c-1);
//            return;
//        }
//
//        list.add(matrix[r][c]);
//        matrix[r][c] = -1;
//        left(matrix, r,c-1);
//    }
//    private void up (int[][] matrix, int r, int c){
//        if (matrix[r][c]==-1 || r==0){
//            list.add(matrix[r][c]);
//            matrix[r][c] = -1;
//            right(matrix,r-1,c);
//            return;
//        }
//
//        list.add(matrix[r][c]);
//        matrix[r][c] = -1;
//        up(matrix, r-1,c);
//    }
//}

import java.util.ArrayList;
        import java.util.List;

public class SpiralMatrix {
    List<Integer> list = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        right(matrix, 0, 0);
        return list;
    }

    private void right(int[][] matrix, int r, int c) {
        while (c < matrix[0].length && matrix[r][c] != -1) {
            list.add(matrix[r][c]);
            matrix[r][c] = -1; // Mark as visited
            c++;
        }
        c--; // Step back to a valid column
        r++; // Move down
        if (r < matrix.length && matrix[r][c] != -1) {
            down(matrix, r, c);
        }
    }

    private void down(int[][] matrix, int r, int c) {
        while (r < matrix.length && matrix[r][c] != -1) {
            list.add(matrix[r][c]);
            matrix[r][c] = -1; // Mark as visited
            r++;
        }
        r--; // Step back to a valid row
        c--; // Move left
        if (c >= 0 && matrix[r][c] != -1) {
            left(matrix, r, c);
        }
    }

    private void left(int[][] matrix, int r, int c) {
        while (c >= 0 && matrix[r][c] != -1) {
            list.add(matrix[r][c]);
            matrix[r][c] = -1; // Mark as visited
            c--;
        }
        c++; // Step back to a valid column
        r--; // Move up
        if (r >= 0 && matrix[r][c] != -1) {
            up(matrix, r, c);
        }
    }

    private void up(int[][] matrix, int r, int c) {
        while (r >= 0 && matrix[r][c] != -1) {
            list.add(matrix[r][c]);
            matrix[r][c] = -1; // Mark as visited
            r--;
        }
        r++; // Step back to a valid row
        c++; // Move right
        if (c < matrix[0].length && matrix[r][c] != -1) {
            right(matrix, r, c);
        }
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sm.spiralOrder(matrix)); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
