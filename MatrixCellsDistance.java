package Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixCellsDistance {
//    public static void main(String[] args) {
//        ArrayList<int[]> arr= allCellsDistOrder(5,4,2,2);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + ",");
//            }
//            System.out.println();
//        }
//
//    }
    public static ArrayList<int[]> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=Math.abs(rCenter-i)+Math.abs(cCenter-j);
            }
        }

//        ArrayList<ArrayList<int[]>> twoDList = new ArrayList<>();
        ArrayList<int[]> ans = new ArrayList<>();
        int sum = 0;

        for (int i= 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j]==sum){
//                    twoDList.add(new ArrayList<>());
                    ans.add(new int[]{i,j});
                }else{
                    sum++;
                }
            }
        }
        return ans;

    }
}
