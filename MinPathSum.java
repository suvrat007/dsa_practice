package Grind75;

public class MinPathSum {
//    public int min = Integer.MAX_VALUE;
//    public int minPathSum(int[][] grid) {
//        solve(grid,0,0,0);
//        return min;
//    }
//
//    public void solve(int[][] grid, int sum,int i , int j ){
//        if (i >= grid.length || j >= grid[0].length) {
//            return;
//        }
//
//        sum+=grid[i][j];
//
//        if (i== grid.length-1 && j==grid[0].length-1){
//            min= Math.min(min,sum);
//            return;
//        }
//
//        if (sum>=min){
//            return;
//        }
//
//        solve(grid,sum,i+1,j );
//        solve(grid,sum,i,j+1 );
//
//    }

    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 1; i < rows; i++) {
            grid[i][0]+=grid[i-1][0];
        }

        for (int j = 1; j < cols; j++) {
            grid[0][j]+=grid[0][j-1];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }

        return grid[rows-1][cols-1];
    }
}
