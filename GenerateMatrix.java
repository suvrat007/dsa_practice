package Grind75;

public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        fillRight(arr,0,0,0);
        return arr;
    }


    public static void fillRight(int[][] arr, int row, int col, int val) {
        int n = arr.length;
        if (val > n * n) return;

        // Write until boundary or visited cell
        while (col < n && arr[row][col] == 0) {
            arr[row][col] = val++;
            col++;
        }

        // Go down from last valid position
        fillDown(arr, row + 1, col - 1, val);
    }

    public static void fillDown(int[][] arr, int row, int col, int val) {
        int n = arr.length;
        if (val > n * n) return;

        while (row < n && arr[row][col] == 0) {
            arr[row][col] = val++;
            row++;
        }

        fillLeft(arr, row - 1, col - 1, val);
    }

    public static void fillLeft(int[][] arr, int row, int col, int val) {
        int n = arr.length;
        if (val > n * n) return;

        while (col >= 0 && arr[row][col] == 0) {
            arr[row][col] = val++;
            col--;
        }

        fillUp(arr, row - 1, col + 1, val);
    }

    public static void fillUp(int[][] arr, int row, int col, int val) {
        int n = arr.length;
        if (val > n * n) return;

        while (row >= 0 && arr[row][col] == 0) {
            arr[row][col] = val++;
            row--;
        }

        fillRight(arr, row + 1, col + 1, val);
    }

}
