package Grind75;

public class NumIslands {
    public int numIslands(char[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;

        int count = 0;
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (grid[row][col]=='1'){
                    solve(grid,row,col);
                    count++;
                }
            }
        }

        return count ;
    }

    public void solve (char[][] grid, int row, int col){
        if (row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] != '1'){
            return;
        }

        grid[row][col] = '0';

        solve(grid, row, col - 1);
        solve(grid, row, col + 1);
        solve(grid, row - 1, col);
        solve(grid, row + 1, col);
    }
}
